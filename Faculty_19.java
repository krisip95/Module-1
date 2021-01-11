package edu.smg03;

import java.util.Date;

public class Faculty_19 extends Employee_19 {
	private String rank;
	private int officeHours;
	
	Faculty_19(String name, String adress, String phoneNumber, String eMail, String office, double salary, String dateHired, String rank, int officeHours){
		super(name, adress, phoneNumber, eMail, office, salary, dateHired);
		this.rank=rank;
		this.officeHours=officeHours;
	}
	
	public String toString() {
		return super.toString() + "\n" + rank + " " + officeHours;
	}
}