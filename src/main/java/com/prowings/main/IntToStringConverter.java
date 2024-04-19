package com.prowings.main;

import org.dozer.DozerConverter;

public class IntToStringConverter extends DozerConverter<Integer, String> {

	public IntToStringConverter() {
	        super(Integer.class, String.class);
	    }

	@Override
	public String convertTo(Integer source, String destination) {
		if (source == null) {
			return null;
		}
		switch (source) {
		case 1:
			return "hi";
		case 2:
			return "World";
		case 3:
			return "hello";
		default:
			return null; // Handle other cases if needed
		}
	}

	@Override
	public Integer convertFrom(String source, Integer destination) {
		// This method is not used in this example, but you can implement it if needed
		return null;
	}
}
