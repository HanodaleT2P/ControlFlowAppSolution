package com.training.java;

public class InterestCalculator {
	public static void main(String[] args) {
		String accountType = "Fixed"; // "Saving", "Fixed", "Recurring"
		double principal = 10000;
		double rate;
		int time = 2; // in years
		double interest;

		switch (accountType) {
		case "Saving":
			rate = 4.0; // 4% for Saving
			break;
		case "Fixed":
			rate = 6.5; // 6.5% for Fixed
			break;
		case "Recurring":
			rate = 5.5; // 5.5% for Recurring
			break;
		default:
			System.out.println("Invalid account type.");
			return;
		}

		// Simple Interest = (Principal × Rate × Time) / 100
		interest = (principal * rate * time) / 100;
		System.out.println("Account Type: " + accountType);
		System.out.println("Simple Interest: " + interest);
	}
}
