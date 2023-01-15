package com.utility.config;

import java.util.HashMap;

import com.utility.exceptions.ConfLoadException;

public class ConfigManager {

	private static HashMap<CONST, IConf> map = new HashMap<>();
	
	public static void init() throws ConfLoadException {
		IConf kafka_conf = new Conf().loadConf("kafka_config.properties");
		map.put(CONST.KAFKA_INDEX, kafka_conf);
		IConf analyser = new Conf().loadConf("analyzer.properties");
		map.put(CONST.ANALYZER_INDEX, analyser);
	}
	
	public static IConf getConfig(CONST key) {
		return map.getOrDefault(key, null);
	}
	
	public static String getVal(CONST index, String key) {
		if(!map.containsKey(index)) {
			return "";
		}
		return map.get(index).get(key);
	}
}
