package edu.smg;

public class PalindromicPrime {
	public static void main(String[] args) {
		System.out.print(2 + "\t");  //izvejda se 2kata zashtoto ne otgovarq na tsikula
		int count = 1;
		int number = 3; //zapo4vame ot 4isloto 3
	
		while(count < 120) {  //tsikulut se vurti dokato ne dostigne 119
			int copyNumber = number;
			int reversedNumber = 0;
			while( copyNumber != 0)  //ako e 4isloto e palindrom count shte se uveli4ava s 1 a na vsqko zavurtane number shte se uveli4ava s 1
			{
				int reminder = copyNumber % 10; //vzimame ostatuka v reminder
				reversedNumber = reversedNumber * 10 + reminder; //v na4aloto reversedNumber = 0
				copyNumber /= 10;
			}
			boolean isPalindrome = number == reversedNumber;
			if( ! isPalindrome ) { 
				number++;
				continue;
			}
			int maxDivider =  (int) Math.ceil( Math.sqrt((number) )); //sqrt i ceil rezultati tip double => prevrushtame posle v int
			boolean isPrime = true;
			for( int i = 2; i <= maxDivider; i++) {
				if( number % i == 0) {
					isPrime = false;
					break; 
				}
			}
			if( ! isPrime) {
				number++;
				continue;
			}
			
			System.out.print(number + "\t");
			count++;
			number++;
			if( count % 10 == 0) {
				System.out.println();
			}
		}
	  	}
	}
	