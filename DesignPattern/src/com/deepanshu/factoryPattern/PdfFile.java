package com.deepanshu.factoryPattern;

public class PdfFile implements Documents {

	private String content;

	public PdfFile(String content) {

		this.content = content;
	}

	@Override
	public String getContent() {
		System.out.println("getting the content for the pdf file");
		return content;
	}

}
