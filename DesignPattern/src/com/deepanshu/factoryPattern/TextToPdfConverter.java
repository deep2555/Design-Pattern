package com.deepanshu.factoryPattern;

public class TextToPdfConverter implements DocumentConverter{
	
	
	@Override
	public String converter(Documents documents) {
		
		return "here is the convert the text file to pdf file";
	}

}
