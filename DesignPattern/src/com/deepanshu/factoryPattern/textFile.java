package com.deepanshu.factoryPattern;

public class textFile implements Documents{

	private String content;
	
	
	public textFile(String content) {
		this.content = content;
	}


	@Override
	public String getContent() {
		System.out.println("here to get the content");
		return content;
	}

	
}
