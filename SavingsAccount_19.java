package edu.smg03;

public class SavingsAccount_19 extends Account_19{
	
	SavingsAccount_19(int id, double balance){
		super(id, balance);
	}
	public void withdraw(double sum) {
		if(balance<sum) {
			System.out.println("Error");
		}else {
			balance = balance-sum;
		}
	}
	public String toString() {
		return super.toString() + " Savings account";
	}
}
