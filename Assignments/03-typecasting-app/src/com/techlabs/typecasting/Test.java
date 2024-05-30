package com.techlabs.typecasting;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		double number=100.5;
		
		int number3=100;
		double number4=number3;  // // implicit type conversion  // Widening expression

		
		int number2=(int)number;// type casting // explicit  // narrowing expression
		
		boolean flag=true;
		
	//	int flag2=(int)flag;
		
		int number5=10;
		
		Scanner scanner=new Scanner(System.in);
		float number6=10.5f;
		
		
		byte number7=15;
		byte number8=3;
		
		byte multiplication;
		
		multiplication=(byte)(number7+number8);
		
		
	}

}
