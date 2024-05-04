package com.deepanshu.builderPattern;

public class Shop {

	
	public static void main(String[] args) {
		
		/*it help while we crating object if we have multiple values in the 
		 * constructor and we dont have to put in sequence  */
		Phone op = new PhoneBuilder().setOs("interl").getPhone();
		System.out.println(op);
	}
}
