package com.analyzer.subscriber;

import com.utility.exceptions.PublishException;

public interface Subscriber {
	public void publish(String key, String val) throws PublishException;
}
