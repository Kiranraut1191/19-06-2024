package com.javaBasics;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Write a java program to calculate product two numbers.
		 * 
		 * Note: read the values from the user.
		 * 
		 */
		
		/**
		 * value1, value2, product are variables which can help us to 
		 * store input and output of the program
		 */		
		
		int value1, value2, product;		
		
		/**
		 * it is class from java.util package,
		 * which can help us to read the values from the keyboard/user.
		 */
		Scanner scanner = new Scanner(System.in);
		
		//print statement
		System.out.println("Enter value1: ");
		value1 = scanner.nextInt();//reads int value
	
		System.out.println("Enter value2: ");
		value2 = scanner.nextInt();//reads int value
		
		scanner.close();//close the read resource
		
		product = value1*value2;//logic/operation
		
		System.out.println(product);//print statement to print output

	}

}
