package edu.smg;

public class TV {
	int channel;
	int volume;
	boolean on;
	
	public TV() {
		channel = 1;
		volume = 4;
		on = false;
	}
	
	public void switchOn() {
		on  = true;
	}
	
	//off
	
	public void setChannel( int newChannel) {
		if( newChannel > 120 || newChannel < 1 || !on) {
			return;
		}
		
		channel++;
	}
	
	//down
	public void volumeDown() {
		if( volume == 1 || !on) {
			return;
		}
		
		volume = --;
	}
	
	public void setVolume( int newVolume) {
		if( newVolume > 7 || newVolume < 1 || !on) {
			return;
		}
		
		volume = newVolume;
	}
	
	//up
	
	public void volumeUp() {
		if( volume == 7 || !on) {
			return;
		}
		
		volume++;
	}

}
