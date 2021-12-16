package com.analyzer.main;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import com.analyzer.converter.IConverter;
import com.analyzer.subscriber.Subscriber;
import com.analyzer.validater.IValidater;
import com.utility.config.CONST;
import com.utility.config.ConfigManager;
import com.utility.config.IConf;
import com.utility.exceptions.ConfLoadException;
import com.utility.messagebus.ConsumerClient;

/**
 * @author ajayp
 * Analyzer service
 */
public class Analyzer {

	static Logger log = Logger.getLogger(Analyzer.class.getName());
	StreamMessager messager;
	Subscriber subscriber;
	IValidater filter;
	IConverter parser;
	ConsumerClient consumer;
	IConf analyserConf;

	private Object getInstance(String classPath) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		return Class.forName(analyserConf.get(
				classPath)).getDeclaredConstructor().newInstance();
	}

	/**
	 * Init of service
	 */
	private void init() {
		log.info("Entry");
		int x = (int) ((Math.random() * (6 - 0)) + 0);
		System.out.println(x);
		try {
			ConfigManager.init();
			analyserConf = ConfigManager.getConfig(CONST.ANALYZER_INDEX);
			
			Subscriber subscriber = (Subscriber) getInstance("analyzer.subscriber");
			IValidater filter = (IValidater) getInstance("analyzer.validator");
			IConverter parser = (IConverter) getInstance("analyzer.converter");
			ConsumerClient consumer = (ConsumerClient) getInstance("analyzer.consumer");
			
			messager = new StreamMessager(subscriber, filter, parser,
					consumer, analyserConf.get("analyzer.topic"));
		} catch (ConfLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    log.info("Exit");
	}

	private void start() {
		log.info("Entry");
		messager.start();
		//messager.join();
	    log.info("Exit");
	}

	public static void main(String[] args) {
		Analyzer analyzer = new Analyzer();
		analyzer.init();
		analyzer.start();
	}
}
