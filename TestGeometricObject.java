package edu.smg03;
import java.util.Scanner;
public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side 1");
		double a = sc.nextDouble();
		System.out.println("Enter side 2");
		double b = sc.nextDouble();
		System.out.println("Enter side 3");
		double c = sc.nextDouble();
		sc.nextLine();
		Triangle_18 t1 = new Triangle_18(a,b,c);
		System.out.println("Enter color");
		String color = sc.nextLine();
		System.out.println("Filled?");
		boolean filled = sc.nextBoolean();
		t1.setColor(color);
		t1.setFilled(filled);
		System.out.print(t1.printTriangle() + "\n" + t1.getArea() + "\n" 
		+ t1.getParameter() + "\n" + t1.getColor() + "\n" + t1.isFilled());
	}
}
