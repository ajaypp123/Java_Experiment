package com.utility.config;

import com.utility.exceptions.ConfLoadException;

public interface IConf {
	public IConf loadConf(String fileName) throws ConfLoadException ;
	public Object getPropertyInstance();
	public String get(String key);
}
