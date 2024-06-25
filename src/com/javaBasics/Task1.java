package com.javaBasics;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter their information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your graduation: ");
        String graduation = scanner.nextLine();

        System.out.print("Enter your institution name: ");
        String institution = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String contactNo = scanner.nextLine();

        // Printing the user information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Graduation: " + graduation);
        System.out.println("Institution: " + institution);
        System.out.println("Contact Number: " + contactNo);

        // Closing the scanner
        scanner.close();
    }
}
