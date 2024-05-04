package com.deepanshu.factoryPattern;

import java.util.HashMap;
import java.util.Map;

public class FactoryClassDocument {

	public static DocumentConverter createDocument(String fileConvert) {

		if (fileConvert.equals("textTOPdf"))
			return new TextToPdfConverter();
		//return fileConverter.get(fileConvert);
		return null;

	}
}
