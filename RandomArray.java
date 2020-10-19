package edu.smg;

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		int[] randomArray = new int[20];   //suzdava se masiv
		for( int i = 0; i < 20; i++) {    //izvurta se 20 puti
			randomArray[i] = (int) (Math.random() * 20) + 1;  //i e ot 0 do 19 i  vrushta double 4islo ot 0 do 1
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(randomArray[i]);
		}
	}
	
}
