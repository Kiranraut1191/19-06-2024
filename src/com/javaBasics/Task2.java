package com.javaBasics;

public class Task2 {

	public static void main(String[] args) {
		
		        // Check if the correct number of arguments are passed
		        if (args.length != 3) {
		            System.out.println("Usage: java SimpleInterestCalculator <principal> <rateOfInterest> <timeDurationInMonths>");
		            return;
		        }

		        // Read the values from command-line arguments
		        double principal = Double.parseDouble(args[0]);
		        double rateOfInterest = Double.parseDouble(args[1]);
		        int timeDurationInMonths = Integer.parseInt(args[2]);

		        // Convert the time duration from months to years
		        double timeDurationInYears = timeDurationInMonths / 12.0;

		        // Calculate simple interest
		        double simpleInterest = (principal * rateOfInterest * timeDurationInYears) / 100;

		        // Print the result
		        System.out.println("Principal: " + principal);
		        System.out.println("Rate of Interest: " + rateOfInterest);
		        System.out.println("Time Duration: " + timeDurationInMonths + " months");
		        System.out.println("Simple Interest: " + simpleInterest);
		    }
		}
