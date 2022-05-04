package com.foodorder;

import com.foodorder.mgt.OrderManager;

import java.util.Scanner;

public class OrderMgtService {

	public static void main(String[] args) {

		System.out.println("Welcome to Ashari Food Orders");
		System.out.println("Please enter a food item name : ");
		Scanner input = new Scanner(System.in);

		OrderManager customerOrderManager = new OrderManager();
		customerOrderManager.handleOrder(input.nextLine());

		input.close();
	}
}
