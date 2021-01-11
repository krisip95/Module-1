package edu.smg03;
import java.util.Date;
public class Employee_19 extends Person_19 {
	private String office;
	private double salary;
	private String dateHired;
	
	Employee_19(String name, String adress, String phoneNumber, String eMail, String office, double salary, String string){
		super(name, adress, phoneNumber, eMail);
		this.office = office;
		this.salary=salary;
		this.dateHired = string;
	}
	
	public String toString() {
		return super.toString() + "\n" + office + " " + salary + " " + dateHired;
	}
}