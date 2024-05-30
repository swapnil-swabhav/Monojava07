package com.techlabs.model;

import java.util.Scanner;

public class MatricsCalculator {

	public static void main(String[] args) {
		
		int matrix[][]=new int[3][3];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter elements of matrix");
		
		createRows(matrix, scanner);
		
		//displayMatrix(matrix);  // implement this on your own
		
		

	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		
		for(int i=0;i<3;i++)
		{
			createColumns(i,matrix,scanner);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner scanner) {

             for(int j=0;j<3;j++)
             {
            	 matrix[i][j]=scanner.nextInt();
             }
		
	}

}
