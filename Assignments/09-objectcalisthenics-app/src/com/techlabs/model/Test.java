package com.techlabs.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int number1=scanner.nextInt();
		System.out.println("Enter second number:");
		int number2=scanner.nextInt();
		
		int max=maximum(number1,number2);
		System.out.println(max);
		
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		int factorial=calculatefactorial(number);
	
		System.out.println(factorial);

	}

	private static int calculatefactorial(int number) {
		
		int factorial=1;
		if(number==0)
			return 1;
		if(number<0)
		{ 
			System.out.println("Cant find factorial of negative number");
			return -1;
		}
		for(int i=1;i<=number;i++)
			factorial=factorial*i;
		return factorial;
		
	}

	private static int maximum(int number1, int number2) {

                 if(number1>number2)
                	 return number1;
                 
               return number2;
	}



}
