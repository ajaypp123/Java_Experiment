package com.utility.config;

import java.io.FileNotFoundException;
import com.utility.exceptions.ConfLoadException;
import java.io.InputStream;
import java.util.Properties;

public class Conf implements IConf{
	InputStream inputStream;
	Properties prop;
	
	public IConf loadConf(String fileName) throws ConfLoadException {
		prop = new Properties();
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block			
			throw new ConfLoadException("Exception: " + e);
		}
		return this;
	}
	
	@Override
	public Object getPropertyInstance() {
		return prop;
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		return prop.getProperty(key);
	}
	
	
}
