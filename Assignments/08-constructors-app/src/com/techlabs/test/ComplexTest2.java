package com.techlabs.test;

import com.techlabs.model.Complex;

public class ComplexTest2 {

	public static void main(String[] args) {
		
		Complex c1=new Complex(1,2);
		Complex c2=new Complex(3,4);
		
		c2=c1;
		
		c1=null;
		
		System.out.println(c2.getImaginary());

	}

}
