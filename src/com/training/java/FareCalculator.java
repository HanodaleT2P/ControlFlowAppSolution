package com.training.java;

import java.util.Scanner;

public class FareCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter distance traveled (km): ");
		int distance = scanner.nextInt();

		int fare = 0;

		if (distance <= 5) {
			fare = distance * 10;
		} else if (distance <= 15) {
			fare = (5 * 10) + ((distance - 5) * 8);
		} else {
			fare = (5 * 10) + (10 * 8) + ((distance - 15) * 5);
		}

		System.out.println("Total Distance: " + distance + " km");
		System.out.println("Total Fare: ₹" + fare);

		scanner.close();
	}
}
