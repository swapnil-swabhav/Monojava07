package com.techlabs.arrays;

import java.util.Scanner;

public class Test2D {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int array[][];
	    array=new int[3][3];
	    
	    System.out.println("Enter Array Elements:");
	    
	    for(int i=0;i<3;i++)
	    	for(int j=0;j<3;j++)
	    		array[i][j]=scanner.nextInt();
	    
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		System.out.print(array[i][j]+" \t");
	    	}
	    	System.out.println("");
	    }
	    
	    

	}

}
