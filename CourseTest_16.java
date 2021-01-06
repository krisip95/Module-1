package edu.smg02;

public class CourseTest_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course_16 course1 = new Course_16("Data Structures");
		Course_16 course2 = new Course_16("Database Systems");
		course1.addStudent("Lee Taeyong");
		course1.addStudent("Jeon Jungkook");
		course1.addStudent("Park Jimin");
		course2.addStudent("Lee Taeyong");
		course2.addStudent("Jeon Jungkook");
		
		System.out.println("Number of students in course 1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students[i] + ", ");
			
			course1.dropStudent("Jeon Jungkook");
			System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());
			for(int i = 0; i < course1.getNumberOfStudents(); i++) {
				System.out.print(students[i] + ", ");
			}
			
			System.out.println();
			System.out.print("Number of students in course2: " +course2.getNumberOfStudents());
			
		}

	}

}
