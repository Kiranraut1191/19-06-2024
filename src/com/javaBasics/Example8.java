package com.javaBasics;

public class Example8 {

	public static void main(String[] args) {
		

		/**
		 * Write a java program to print your 
		 * information(name, graduation, from where, contactNO) using 
		 * command-line arguments
		 */
		
		String name = args[0];
		String education = args[1];
		String fromWhere = args[2];
		long contact = Long.parseLong(args[3]);
		
		//output statement
		System.out.println("Name: "+ name);		
		System.out.println("Education: "+ education);		
		System.out.println("FromWhere: "+ fromWhere);		
		System.out.println("Contact Number: "+ contact);

	}

}
