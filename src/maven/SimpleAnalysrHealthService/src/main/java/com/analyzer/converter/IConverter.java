package com.analyzer.converter;

import com.analyzer.model.Model;

public interface IConverter {
	public Model convertEvent(String message);
}
