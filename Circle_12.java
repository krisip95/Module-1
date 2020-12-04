package edu.smg;

public class Circle_12 {
	private double radius;
	
	public Circle_12() { 
		 radius = 1;
	}
	
	public Circle_12( double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}
	}
	

