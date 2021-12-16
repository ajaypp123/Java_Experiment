package com.utility.messagebus;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.log4j.Logger;

import com.analyzer.subscriber.Subscriber;
import com.utility.config.CONST;
import com.utility.config.ConfigManager;
import com.utility.config.IConf;
import com.utility.exceptions.PublishException;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaConsumerClient implements ConsumerClient{

	static Logger log = Logger.getLogger(KafkaConsumerClient.class.getName());
	KafkaConsumer<String, String> consumer = null;

	/*
	public static void main(String[] args) {
		KafkaConsumerClient kc = new KafkaConsumerClient();
		try {
			ConfigManager.init();
			kc.createConnection("TOPIC1");
			try {
				kc.printRecord(kc.consumer);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ConfLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printRecord(KafkaConsumer<String, String> consumer) {
		while (true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord<String, String> record : records) {
				logger.info("Key: " + record.key() + ", Value:" + record.value());
				logger.info("Partition:" + record.partition() + ",Offset:" + record.offset());
			}
		}
	}
	 */
	
	public void createConnection(String topic) {
		log.debug("Entry");
		IConf kafkaConfig = ConfigManager.getConfig(CONST.KAFKA_INDEX);

		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
				kafkaConfig.get("Kafka.BOOTSTRAP_SERVERS"));
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, kafkaConfig.get(topic + ".Consumer.GROUP_ID"));
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,
				kafkaConfig.get(topic + ".Consumer.AUTO_OFFSET_RESET"));

		// Create the consumer using props.
		consumer = new KafkaConsumer<>(properties);

		// Subscribe to the topic.
		consumer.subscribe(Collections.singletonList(topic));
		log.debug("Exit");
	}

	public void startStreaming(Subscriber subscriber) {
		log.debug("Entry");
		while (!Thread.interrupted()) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord<String, String> record : records) {
				try {
					subscriber.publish(record.key(), record.value());
				} catch (PublishException e) {
					// TODO Auto-generated catch block
					log.error("Failed to parse message [" + record.key() + "]->[" 
							+ record.value() + "]. Error: " + e);
				}
			}
		}
	}
	
	public void close() {
		consumer.close();
	}
}
