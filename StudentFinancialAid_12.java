package edu.smg;

import java.util.Scanner;

public class StudentFinancialAid_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_12[] students = new Student_12[5]; //suzdavame masiv ot u4enitsi
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			sc.nextLine();
			
			students[i] = new Student_12( name, grade); //suzdavame obekt u4enik
		}
		
		displayStudentsEligible(students); //izvejdat se u4enitsite koito otgovarqt na iziskvaniqta

	}
	
	public static void displayStudentsEligible(Student_12 students[]) {
		for(Student_12 s : students) {
			if( isStudentEligible(s)) {
				System.out.println(s.getName());
				
			}
		}
	}

	private static boolean isStudentEligible(Student_12 s) {
		return s.getGrade() > 5.50;
	}

}
