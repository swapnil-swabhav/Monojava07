package com.techlabs.ifelse;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		
		if(number>0)		
			System.out.println("Number is positive");		
		else		
			System.out.println("Number is negative");
		

	}

}
