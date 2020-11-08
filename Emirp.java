package edu.smg;

public class Emirp {
	
	public static void main(String[] args) {
		
		int count = 0;
		int number = 3;
		
		while( count < 120) {
		
			
			if( ! isPrime(number) || isPalindrome(number) || ! isPrime(reverseNumber(number)) ) {
				number++;
				continue;
			}
			
			System.out.print(number + "\t");
			count++;
			number++;
			if( count % 10 == 0) { //na vsqko 10to takova 4islo se izvejda nov red
				System.out.println();
			
			}
		}
	}
	private static int reverseNumber(int number) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static boolean isPrime( int aNumber) {
		int maxDivider = ( int) Math.ceil(Math.sqrt( aNumber));
		boolean isPrime = true;
		for( int i = 2; i <= maxDivider; i++) {
			if( aNumber % i == 0) {
			isPrime = false;
			break;
		}
	}
		return isPrime; 
}

	public static boolean isPalindrome( int aNumber) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while(copyNumber != 0)
		{
			int reminder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			copyNumber /= 10;
		}
		return reversedNumber;
	}

	
}

