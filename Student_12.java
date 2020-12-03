package edu.smg;

public class Student_12 {
	private String name;
	private double grade;
	
	public Student_12() { 
		
	}
	
	public Student_12( String name, double grade) {
		this.setName(name); 
		this.setGrade(grade);
	}


	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}


