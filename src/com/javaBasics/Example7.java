package com.javaBasics;

public class Example7 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to calculate the sum of two numbers
		 * 
		 * Note: read values from command-line arguments
		 */
		
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		
		int sum;
		
		sum = value1+value2;
		
		System.out.println(sum);

	}

}
