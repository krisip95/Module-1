package edu.smg;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon polygon1 = new Polygon();
		Polygon polygon2 = new Polygon(6, 4.0);
		Polygon polygon3 = new Polygon(10, 4.0, 5.6, 7.8);
		
		System.out.println("The perimeter of  polygon1 is " + polygon1.getPerimeter());
		System.out.println("The area of  polygon1 is " + polygon1.getArea());
		System.out.println("The perimeter of  polygon2 is " + polygon2.getPerimeter());
		System.out.println("The area of  polygon2 is " + polygon2.getArea());
		System.out.println("The perimeter of  polygon3 is " + polygon3.getPerimeter());
		System.out.println("The area of  polygon3 is " + polygon3.getArea());
	}
}