package edu.smg;

public class NestedLoops {
	
	public static void main(String[] args) {
		
		System.out.println("Pattern A");
		for (int rows = 0; rows < 6; rows++) {			
			for (int ws = 0; ws < rows; ws++) {				
				System.out.print("  ");
			}
			for (int col = 0; col < 6 - rows; col++) {	
				System.out.print((col + 1) + " ");
			}
			System.out.println();								
		}
	}
}