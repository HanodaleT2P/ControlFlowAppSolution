package com.training.java;

public class OrderStatus {
	public static void main(String[] args) {
		int statusCode = 2; // 1 - Confirmed, 2 - Shipped, 3 - Out for Delivery, 4 - Delivered, 5 -
							// Cancelled

		switch (statusCode) {
		case 1:
			System.out.println("Order Confirmed.");
			break;
		case 2:
			System.out.println("Order Shipped.");
			break;
		case 3:
			System.out.println("Order Out for Delivery.");
			break;
		case 4:
			System.out.println("Order Delivered.");
			break;
		case 5:
			System.out.println("Order Cancelled.");
			break;
		default:
			System.out.println("Invalid Status Code.");
		}
	}
}
