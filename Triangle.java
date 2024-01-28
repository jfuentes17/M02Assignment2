/*
 * Program Name: TriangleTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: Has the user enter the characteristics of a triangle and then displays
 * data about the triangle.
 */

import java.util.*;

public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	//These are the three double data fields with default values 1.0 to denote
	//three sides of a triangle.
	
	Triangle()
	{
		side1 = side2 = side3 = 1.0;
	}
	//This is the no-arg constructor that creates a default triangle.
	
	Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//This is a constructor that creates a triangle with the specified 
	//side1, side2, and side3.
	
	public double getSide1() 
	{
		return side1;
	}
	public double getSide2() 
	{
		return side2;
	}
	public double getSide3() 
	{
		return side3;
	}
	//These are the accessory methods for all three data fields.
	
	public double getArea() 
	{
		double i = (side1 + side2 + side3)/2;
		return Math.sqrt(i * (i-side1) * (i-side2) * (i-side3));
	}
	//This should return the area of the triangle.
	//After some testing, even after looking at other examples on how to create
	//the area of the triangle, this formula still looks foreign to me.
	//Having had A=bh/2 stuck in my head this whole time, took me awhile to 
	//wrap my head around this.
	
	public double getPerimeter() 
	{
		return side1 + side2 + side3;
	}
	//This should return the area of the triangle.
	
	public String toString() 
	{
		return "Triangle:" + "\nside1 = " + side1 + "\nside2 = "
				+ side2 + "\nside3 = " + side3;
	}
	//This should return a string description for the triangle.
}


/*
 *     Triangle UML
 *  ----------------------
 *  -side1: double
 *  -side2: double
 *  -side3: double
 *  ----------------------
 *  +Triangle()
 *  +Triangle(side1: double, 
 *  	side2(): double, 
 *  	side3(): double)
 *  +getSide1(): double
 *  +getSide2(): double
 *  +getSide3(): double
 *  +getArea(): double 
 *  +getPerimeter(): double
 *  +toString(): String
 */     
