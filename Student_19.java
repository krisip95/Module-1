package edu.smg03;

public class Student_19 extends Person_19 {
	private String classStatus;
	
	Student_19(String name, String adress, String phoneNumber, String eMail, String classStatus) {
		super(name, adress, phoneNumber, eMail);
		this.classStatus=classStatus;
	}
	
	public String toString() {
		return super.toString() + "\n" + classStatus;
	}
}