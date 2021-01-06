package edu.smg02;

public class MyInteger_15 {
	private int value;
	
	public MyInteger_15(int value) {
		this.value = value;  
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isOdd() {
		return this.value % 2 !=0;
	}
	
	public boolean isEven() {
		return ! this.isOdd();
	}
	
	public boolean isPrime() {
		int maxDivider = (int)Math.sqrt(value);
		for(int i = 2; i <= maxDivider; i++) {
			if(this.value % 1 == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public static boolean isEven(int value) {
		return ! MyInteger_15.isOdd(value);
	}
	
	public static boolean isPrime(int value) {
		int maxDivider = (int)Math.sqrt(value);
		for(int i = 2; i <= maxDivider; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isOdd(MyInteger_15 value) {
		return value.getValue() % 2 != 0;
	}
	
	public static boolean isEven(MyInteger_15 value) {
		return ! MyInteger_15.isOdd(value);
	}
	
	public static boolean isPrime(MyInteger_15 value) {
		int maxDivider = (int)Math.sqrt(value.getValue());
		for(int i = 2; i <= maxDivider; i++) {
			if(value.getValue() % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}