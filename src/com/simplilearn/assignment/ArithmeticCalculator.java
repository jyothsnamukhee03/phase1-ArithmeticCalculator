package com.simplilearn.assignment;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String args[]) {
		int first_number,second_number,option;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------");
		System.out.println("$$$$$$$$Arithmetic Calculator$$$$$$$$");
		System.out.println("Developed By Mukhee Jyothsna");
		System.out.println("---------------------------------------------");
		
		System.out.println("Enter the First Number: ");
		first_number = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		second_number = sc.nextInt();
		
		System.out.println("Enter the option you want to perform:");
		System.out.println("1) Addition   2) Subtraction  3) Multiplication  4)Division");
		option = sc.nextInt();
		
		switch(option) {
			case 1: System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));
				break;
			case 2: System.out.println(first_number + " - " + second_number + " = " + (first_number - second_number));
				break;
			case 3: System.out.println(first_number + " X " + second_number + " = " + (first_number * second_number));
				break;
			case 4: if(second_number == 0) {
						System.out.println("Division By zero can't be Done");
					}else {
						System.out.println(first_number + " / " + second_number + " = " + (first_number / second_number));
					}
					break;
			default: System.out.println("Sorry!! You Selected Invalid Option !!");
		}
		
	}
}
