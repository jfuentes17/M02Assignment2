/*
 * Program Name: TriangleTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: Has the user enter the characteristics of a triangle and then displays
 * data about the triangle.
 */

import java.util.*;
import java.util.Scanner;

public class TriangleTest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//This creates the scanner.
		
		System.out.print("Please enter three sides of the triangle: ");
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		double side3 = scan.nextDouble();
		//This asks the user to enter the sides of the triangle.
		
		System.out.print("Please enter a color: ");
		String color = scan.next();
		//This asks the user to enter the color of the triangle.
		
		System.out.print("Is the triangle filled? (true/false): ");
		boolean filled = scan.nextBoolean();
		//This asks the user to enter if the triangle is filled or not.
		
		Triangle triangle = new Triangle(side1,side2,side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		System.out.println(triangle.toString());
		System.out.println("Triangle Area: " + triangle.getArea());
		System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
		System.out.println("Triangle Color: " + triangle.getColor());
		System.out.println("The triangle is" + (triangle.isFilled()? " ":" not ") + "filled");
		
		scan.close();
	}
} 
