package com.analyzer.subscriber;

import org.apache.log4j.Logger;
import com.utility.exceptions.PublishException;

public class LogSubscriber implements Subscriber{

	static Logger log = Logger.getLogger(LogSubscriber.class.getName());
	@Override
	public void publish(String key, String val) throws PublishException {
		// TODO Auto-generated method stub
		log.info("LogSubscriber: Key: " + val + " , Value: " + val);
	}

}
