package com.training.java;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		String correctPassword = "admin123";
		String input;
		int attempts = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Enter password: ");
			input = scanner.nextLine();
			attempts++;

			if (input.equals(correctPassword)) {
				System.out.println("Login successful!");
				break;
			} else {
				System.out.println("Incorrect password. Attempts left: " + (3 - attempts));
			}
		} while (attempts < 3);

		if (!input.equals(correctPassword)) {
			System.out.println("Maximum attempts reached. Access denied.");
		}

		scanner.close();
	}
}
