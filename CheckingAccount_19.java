package edu.smg03;

public class CheckingAccount_19 extends Account_19 {
	private double overdraft;
	
	CheckingAccount_19(int id, double balance,double overdraft){
		super(id, balance);
		setOverdraft(overdraft);
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public void withdraw(double sum) {
		if(balance+overdraft<sum) {
			System.out.println("Error");
		}else {
			balance = balance-sum;
		}
	}
	public String toString() {
		return super.toString() + " Checking account";
	}
}