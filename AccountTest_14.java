package edu.smg;

public class AccountTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account_14 acc = new Account_14();
		acc.setId(1122);
		acc.setBalance(20000);
		acc.setYearInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance() + "\nMonthly inerest: " + acc.getMonthlyInterest() + 
				"\nDate: " + acc.getDateCreated());
		}
	
	}
