package edu.smg02;

import java.util.Scanner;

import edu.smg.Account_14;

public class ATM_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account_14[] accounts = new Account_14[10];
		for(int i = 0; i < 10; i++) {
			accounts[i] = new Account_14(i, 100);
		}
		
		Scanner sc = new Scanner(System.in);
		int id = -1;
		do {
			System.out.println("Input an id");
			id = sc.nextInt();
		} while( id < 0 || id > 9);
		
		int option = -1;
		while( option != 4) {
			System.out.println("Main menu\n "
					+ "1: check balance\n "
					+ "2: withdraw\n "
					+ "3: deposit\n "
					+ "4: exit\n "
					+ "Enter a choise: \n");
			option = sc.nextInt();
			if(option == 1) {
				System.out.println("You have " +  
								accounts[id].getBalance());
			}else if (option == 2) {
				System.out.println("Amount to withdraw?");
				double amount = sc.nextDouble();
				accounts[id].withdraw(amount);
				
			}else if(option == 3) {
				System.out.println("Amount to deposit?");
				double amount = sc.nextDouble();
				accounts[id].deposit(amount);
			}
		}
	}
}




