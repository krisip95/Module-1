package edu.smg03;

public class Person_19 {
	private String name;
	private String adress;
	private String phoneNumber;
	private String eMail;
	
	Person_19(String name, String adress, String phoneNumber, String eMail){
		this.name=name;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
	}
	
	public String toString() {
		return name + " " + adress + " " + phoneNumber + " " + eMail;
	}
}