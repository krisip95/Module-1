package edu.smg;

import java.util.Scanner;

public class StudentFinancialAid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_11[] students = new Student_11[5]; 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student_11( name, grade); 
		}
		
		displayStudentsEligible(students); 
	}
	
	public static void displayStudentsEligible(Student_11 students[]) {
		for(Student_11 s : students) {
			if( isStudentEligible(s)) {
				System.out.println(s.name);
				
			}
		}
	}

	private static boolean isStudentEligible(Student_11 student) {
		return student.grade > 5.50;
	}

}
