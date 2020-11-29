package edu.smg;

public class FanTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan_14 fan1 = new Fan_14();
		fan1.setSpeed(Fan_14.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setSwitchedOn(true);
		
		Fan_14 fan2 = new Fan_14(); 
		fan2.setSpeed(Fan_14.MEDIUM);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}
