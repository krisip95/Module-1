package edu.smg;

import java.lang.Math;

public class Polygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0; 
	private double y = 0; 
	
	public Polygon() { 
		
	}
	
	public Polygon(int z, double t) { 
		this.setN(z);
		this.setSideLength(t);
	}
	
	public Polygon(int z, double t, double x, double y) { 
		this.setN(z);
		this.setSideLength(t);
		this.setX(x);
		this.setY(y);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter () {
		double perimeter;
		perimeter = this.n * this.sideLength;
		return perimeter;
	}
	
	public double getArea () {
		double area;
		area = this.n * Math.pow(sideLength, 2) /  4 * Math.tan(Math.PI / n);
		return area;
	}
}
