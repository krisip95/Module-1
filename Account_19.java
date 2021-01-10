package edu.smg03;
import java.util.Date;

public class Account_19 {
	
private int id=0;
protected  double balance=0;
private static double yearInterestRate=4.5;

private Date dateCreated = new Date();

public Account_19() {
	
}

public Account_19(int id, double balance) {
	this.setID(id);
	this.setBalance(balance);
}
public int getID() {
	return id;
}
public void setID(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public Date getDateCreated() {
	return dateCreated;
}
	
public static double getYearInterestRate() {
	return yearInterestRate;
}

public static void setYearInterestRate(double aYearInterestRate) {
	yearInterestRate = aYearInterestRate;
}

public static double getMonthlyInterestRate() {
	
	double getMothlyInterestRate=yearInterestRate/12;
	return getMothlyInterestRate;
	
	
}


public double getMonthlyInterest() {
	double monthlyInterestRate=yearInterestRate/12;

	double monthlyInterest = balance*monthlyInterestRate/100;
	
	return monthlyInterest;
	
}
public void withdraw(double withdrawSum) {

	balance=balance-withdrawSum;
	
}
public void deposit(double depositSum) {
	
	balance+=depositSum;
}
}