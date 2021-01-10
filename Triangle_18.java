package edu.smg03;

public class Triangle_18 extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle_18() {
		
	}
	public Triangle_18(double side1, double side2, double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getArea() {
		double p=(side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	public double getParameter() {
		return side1+side2+side3;
	}
	public String printTriangle() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
}