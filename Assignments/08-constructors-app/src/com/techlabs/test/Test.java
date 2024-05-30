package com.techlabs.test;

public class Test {

	public static void main(String[] args) {
		
		
		String str1=new String("abc");
		
		String str2=new String("xyz");
		
		str2=str1;
		
		str1=null;
		
		System.out.println(str2);

	}

}
