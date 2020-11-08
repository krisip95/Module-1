package edu.smg;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cl = new Circle();
		System.out.println("Area of cl" + cl.getArea() + " perimeter of cl" + cl.getPerimeter());
		
		Circle cl2 = new Circle();
		System.out.println("Area of c2 " + cl.getArea() + " perimeter of c2 " + cl.getPerimeter());
		
		cl.setRadius(10);
		System.out.println("Area of cl " + cl.getArea() + " perimeter of cl " + cl.getPerimeter());
		
		

	}

}
