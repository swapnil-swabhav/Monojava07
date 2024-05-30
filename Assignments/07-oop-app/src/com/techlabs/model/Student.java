package com.techlabs.model;

import java.util.Scanner;

public class Student {
	
	private int rollnumber;
	private String name;
	private int age;
	
	public void setRollNumber(int rollnumber1)  // setter
	{
		rollnumber=rollnumber1;
	}
	
	public int getRollNumber()  // getter
	{
		return rollnumber;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age1)
	{
		age=age1;
	}
	
	public int getAge()
	{
		return age;
	}
	
	

}
