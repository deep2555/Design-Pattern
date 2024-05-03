package com.deepanshu.singletonclass;

public class CallingSingleton {

	public static void main(String[] args) {
		
		// calling the singleton object
		
		ConfigurationManager configurationManager = ConfigurationManager.getInstance();
		System.out.println(configurationManager.ShowDetails());
		
		

	}

}
