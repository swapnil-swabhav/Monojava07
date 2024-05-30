package com.techlabs.forloop;

import java.util.Scanner;

public class FcatorialCalculator {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int factorial=1;
		for(int i=number;i>=1;i--)
			factorial=factorial*i;
		
		System.out.println("Fcatorial="+factorial);

	}

}
