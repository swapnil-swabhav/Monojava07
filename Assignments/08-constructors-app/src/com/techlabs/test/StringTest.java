package com.techlabs.test;

public class StringTest {

	public static void main(String[] args) {
		
		String str1="abc";
		String str2=new String("xyz");
		
		String str3=str1+str2;
		
		String str4=new String("abcxyz");
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		str1=call(str1,str2);
		
		System.out.println(str1.hashCode());
				
				
				

	}

	private static String call(String str1, String str2) {
		
		System.out.println(str1.hashCode());
		
		System.out.println(str2.hashCode());
		
		return str1+"ghi";
		
	}

}
