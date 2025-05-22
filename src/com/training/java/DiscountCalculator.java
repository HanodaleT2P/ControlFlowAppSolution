package com.training.java;

public class DiscountCalculator {
	public static void main(String[] args) {
		double totalAmount = 4200;
		double discount;
		double finalAmount;

		if (totalAmount > 5000) {
			discount = 0.20; // 20% discount
		} else if (totalAmount > 3000) {
			discount = 0.10; // 10% discount
		} else {
			discount = 0.05; // 5% discount
		}

		finalAmount = totalAmount - (totalAmount * discount);

		System.out.println("Original Amount: ₹" + totalAmount);
		System.out.println("Discount Applied: " + (discount * 100) + "%");
		System.out.println("Final Amount to Pay: ₹" + finalAmount);
	}
}
