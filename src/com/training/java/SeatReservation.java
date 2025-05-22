package com.training.java;

public class SeatReservation {
	public static void main(String[] args) {
		int totalSeats = 40;
		int reserved = 0;

		while (reserved < totalSeats) {
			reserved++;
			System.out.println("Seat " + reserved + " reserved.");
		}

		System.out.println("All seats are reserved.");
	}
}
