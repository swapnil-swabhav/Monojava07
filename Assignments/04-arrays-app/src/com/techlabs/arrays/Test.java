package com.techlabs.arrays;

public class Test {

	public static void main(String[] args) {
		
		int array[];
		array=new int[10];
		System.out.println(array[0]);
		array[1]=40;
		array[5]=50;
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
		System.out.println(array[11]);

	}

}


