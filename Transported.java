package edu.smg;

import java.util.Scanner;

public class Transported {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number on raws");
		int rawSize = sc.nextInt();
		System.out.println("Enter a number on columns");
		int columnSize = sc.nextInt();
		int[][] matrix = new int[rawSize][columnSize];
		int[][]transported = new int[columnSize][rawSize];
		for (int i = 0; i < columnSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				System.out.println("Enter a number on idnex " + i+ ", " + j);
			}
		}
		for (int i = 0; i < rawSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				System.out.println(matrix[i][j] + " \t");
			}
			System.out.println();
			}
		for (int i = 0; i < rawSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				transported[j][i] = matrix[i][j];
			}
		}
		System.out.println("Transported: \n");
		
		for(int i = 0; i < columnSize; i++) {
			for(int j = 0; j < rawSize; j++) {
				System.out.print (transported[i][j] + " \t");
			}
			System.out.println();
		}
		
		
	}
}
