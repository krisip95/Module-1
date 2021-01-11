package edu.smg03;

import java.util.Date;

public class Staff_19 extends Employee_19 {
	private String title;
	
	Staff_19(String name, String adress, String phoneNumber, String eMail, String office, double salary, String dateHired, String title){
		super(name, adress, phoneNumber, eMail, office, salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\n" + title;
	}
}