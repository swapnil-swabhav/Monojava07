package com.techlabs.test;

import com.techlabs.model.Complex;

public class ComplexTest {

	public static void main(String[] args) {

          Complex complexNumber1=new Complex(10,5);
          System.out.println("Complex Number1:"+complexNumber1.getReal()+"+"+complexNumber1.getImaginary()+"i");
          Complex complexNumber2=new Complex(5,7);
          System.out.println("Complex Number2:"+complexNumber2.getReal()+"+"+complexNumber2.getImaginary()+"i");
          Complex result=addition(complexNumber1,complexNumber2);
          
          System.out.println("Addition:"+result.getReal()+"+"+result.getImaginary()+"i");
          
          System.out.println("Complex Number1:"+complexNumber1.getReal()+"+"+complexNumber1.getImaginary()+"i");

	}

	private static Complex addition(Complex complexNumber1, Complex complexNumber2) {
		
		Complex result=new Complex();
		result.setImaginary(complexNumber1.getImaginary()+complexNumber2.getImaginary());
		result.setReal(complexNumber1.getReal()+complexNumber2.getReal());
		complexNumber1.setImaginary(15);
		return result;
	}

}
