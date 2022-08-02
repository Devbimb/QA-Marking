package org;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		boolean running = true;
		Calculator cal = new Calculator();
		
		Scanner scn = new Scanner(System.in);
		
//		while (running) {
		
		System.out.println("-------------------------------------------");
		System.out.println("|   Hello welcome to Devbimb Calculator   |");
		System.out.println("-------------------------------------------");
		System.out.println("  ");
		System.out.println("What would you like to do?");
		System.out.println("  ");
		while (running) {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Exit");
		System.out.println("  ");
		System.out.println("Please enter a number");
		System.out.println("  ");
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("  ");
			System.out.println("Good choice- addition");
			System.out.println("  ");
			System.out.println("the result is "+cal.plus());
			System.out.println("  ");
			System.out.println("What else would you like to do?");
			break;
		case 2:
			System.out.println("  ");
			System.out.println("Good choice- subtraction");
			System.out.println("  ");
			System.out.println("the result is "+cal.minus());
			System.out.println("  ");
			System.out.println("What else would you like to do?");
			break;
		case 3:
			System.out.println("  ");
			System.out.println("Good choice- division");
			System.out.println("  ");
			System.out.println("the result is "+cal.division());
			System.out.println("  ");
			System.out.println("What else would you like to do?");
			break;
		case 4:
			System.out.println("  ");
			System.out.println("Good choice- multiplication");
			System.out.println("  ");
			System.out.println("the result is "+cal.multiply());
			System.out.println("  ");
			System.out.println("What else would you like to do?");
			break;
		case 5:
			System.out.println("  ");
			System.out.println("--------------------------------------");
			System.out.println("      You are leaving, take care.     ");
			running = false;
			System.out.println("--------------------------------------");
			break;
		default:
			System.out.println("  ");
			System.out.println("I know only so much mathematics.. please always enter a valid choice");
			System.out.println("  ");
			break;
		}

	}

  }
	
}
