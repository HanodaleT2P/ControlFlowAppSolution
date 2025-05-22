package com.training.java;

import java.util.Scanner;

public class ATMWithdrawal {
	public static void main(String[] args) {
		int balance = 5000;
		int withdrawAmount;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter amount to withdraw: ");
		withdrawAmount = scanner.nextInt();

		if (withdrawAmount <= balance) {
			balance -= withdrawAmount;
			System.out.println("Withdrawal successful!");
			System.out.println("Remaining balance: " + balance);
		} else {
			System.out.println("Insufficient balance. Withdrawal failed.");
		}

		scanner.close();
	}
}
