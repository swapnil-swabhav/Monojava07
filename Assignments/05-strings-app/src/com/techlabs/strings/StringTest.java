package com.techlabs.strings;

public class StringTest {

	public static void main(String[] args) {
		
       StringBuffer middleName=new StringBuffer("Techlabs");
       StringBuilder lastName=new StringBuilder("Mumbai");
       String firstName=new String("Swabhav");
       
       concat1(middleName);       
       System.out.println(middleName);
       concat2(lastName);
       System.out.println(lastName);
       concat3(firstName);
       System.out.println(firstName);
       
	}

	private static void concat3(String firstName) {
		firstName=firstName+"Techlabs Mumbai";
		
	}

	private static void concat2(StringBuilder lastName) {
		lastName=lastName.append("Swabhav Techlabs");
		
	}

	private static void concat1(StringBuffer middleName) {
		middleName=middleName.append("Swabhav Mumbai");
		
	}

}
