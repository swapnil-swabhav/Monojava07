package com.techlabs.switchcase;

import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	      System.out.println("Enter a grade");
	      String grade=scanner.next();
	      
	      switch(grade)
	      {
	          case "A":  System.out.println("Excellent");  
	                     break;
	          case "B" : System.out.println("Good"); 
	                     break;
	          case "C" : System.out.println("Needs Improvement");
	                     break;
	          case "D" : System.out.println("Fail");
	                     break;
	          default: System.out.println("Please Enter Valid Grade");
	          
	      }

	}
	
	
}
