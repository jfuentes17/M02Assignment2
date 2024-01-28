/*
 * Program Name: TriangleTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: Has the user enter the characteristics of a triangle and then displays
 * data about the triangle.
 * 
 * This class was provided by the instructor, I just changed around the formatting to match 
 * my style in general coding. I did keep the comments that were already in the coding.
 */

import java.util.*;

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject 
{
	 private String color = "white";
	 private boolean filled;

	 /**Default construct*/
	 protected GeometricObject() 
	 {
	 }

	 /**Construct a geometric object*/
	 protected GeometricObject(String color, boolean filled) 
	 {
	   this.color = color;
	   this.filled = filled;
	 }

	 /**Getter method for color*/
	 public String getColor() 
	 {
	   return color;
	 }

	 /**Setter method for color*/
	 public void setColor(String color) 
	 {
	   this.color = color;
	 }

	 /**Getter method for filled. Since filled is boolean,
	    so, the get method name is isFilled*/
	 public boolean isFilled() 
	 {
	    return filled;
	 }

	 /**Setter method for filled*/
	 public void setFilled(boolean filled) 
	 {
	   this.filled = filled;
	 }

	 /**Abstract method findArea*/
	 public abstract double getArea();

	 /**Abstract method getPerimeter*/
	 public abstract double getPerimeter();
}


/*
*	     GeometricObject UML
* -------------------------------------
* -color: String
* -filled: boolean
* -------------------------------------
* +GeometricObject()
* +GeometricObject(color: String, filled: boolean)
* +getColor(): String
* +setColor(color: String): void
* +isFilled(): boolean
* +setFilled(filled: boolean): void
* +getArea(): double: abstract
* +getPerimeter(): double: abstract
*/