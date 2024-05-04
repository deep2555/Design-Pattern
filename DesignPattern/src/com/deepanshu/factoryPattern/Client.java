package com.deepanshu.factoryPattern;

public class Client {

	public static void main(String[] args) {
		
		Documents textDocuments = new textFile("hello");
		Documents pdfDocuments = new PdfFile("hello string");
		
		DocumentConverter textTOPdfConverter = FactoryClassDocument.createDocument("textTOPdf");
		
		 // Convert documents
	    String pdfResult = textTOPdfConverter.converter(textDocuments);
	    System.out.println("pdf: "+ pdfResult);
	 
	}
	
	
}
