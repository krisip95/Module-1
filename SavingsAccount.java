package edu.smg;

public class SavingsAccount {
	public double balance; // 3 poleta
	public double interestRate = 0.1;
	public String name;
	
	public void deposit( double sum) {
		balance += sum;
		System.out.println("Successful deposit " + sum + " new balance " + balance);
		
	}
	
	public void withdraw( double sum) { //sumata koqto shte se tegli
		if(sum < 0 || sum > balance) {
			System.out.println("error");
			return; //ako parameturut sum ne e validen se prekratqva s return
		}
		balance -= sum;
		System.out.println("Successful withdraw " + sum + " new balane " + balance);
	}

}
