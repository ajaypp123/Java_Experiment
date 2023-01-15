package com.analyzer.main;

import org.apache.log4j.Logger;

import com.analyzer.converter.IConverter;
import com.analyzer.subscriber.Subscriber;
import com.analyzer.validater.IValidater;
import com.utility.exceptions.PublishException;
import com.utility.messagebus.ConsumerClient;

public class StreamMessager extends Thread {

	static Logger log = Logger.getLogger(StreamMessager.class.getName());
	Subscriber subscriber;
	IValidater validator;
	IConverter converter;
	ConsumerClient consumer;

	public StreamMessager(Subscriber subscriber, IValidater filter, 
			IConverter parser,
			ConsumerClient consumer,
			String topic) {
		log.debug("Create connection");
		this.subscriber = subscriber;
		this.converter = parser;
		this.validator = filter;
		this.consumer = consumer;
		consumer.createConnection(topic);
		log.debug("Connection created");
	}

	public void run() {
		try {
			// add logic to filter parser
			consumer.startStreaming(subscriber);
		} catch (PublishException e) {
			e.printStackTrace();
		}
	}
}
