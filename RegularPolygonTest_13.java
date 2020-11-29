package edu.smg;

public class RegularPolygonTest_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon_13 p1 = new RegularPolygon_13 (6, 4);
		RegularPolygon_13 p2 = new RegularPolygon_13 (10, 4, 5.6, 7.8);
		RegularPolygon_13 p3 = new RegularPolygon_13 ();
		System.out.println(p1.getPerimeter());
		System.out.println(p1.getArea());
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());
		System.out.println(p3.getPerimeter());
		System.out.println(p3.getArea());
	}

}
