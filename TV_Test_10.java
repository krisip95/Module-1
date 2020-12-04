package edu.smg;

public class TV_Test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV_10 tv1 = new TV_10();
		System.out.println("channel " + tv1.channel + "  volume " + tv1.volume + " on: " + tv1.on);
		tv1.switchOn();
;		tv1.volumeUp();
		System.out.println("channel " + tv1.channel + "  volume " + tv1.volume + " on: " + tv1.on);
		

	}

}
