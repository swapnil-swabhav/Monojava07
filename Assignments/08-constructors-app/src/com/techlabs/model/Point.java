package com.techlabs.model;

public class Point {
	
	private int x;
	private int y;
	
	public Point()   // default
	{
		System.out.println("Inside constructor");
	}
//	
	public Point(int x, int y)  // parameterized x=25,, y=50
	{
		this.x=x;
		this.y=y;
		
	}
	
	public Point(Point point)  // parameterized
	{
		x=point.getX();
		y=point.getY();
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public int getX()
	{
		return x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY()
	{
		return y;
	}

}
