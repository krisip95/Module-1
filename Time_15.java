package edu.smg02;

public class Time_15 {
	private int hour, minute, second;
	
	public Time_15() {
		this(System.currentTimeMillis());
	}
	
	public Time_15 (long millisecs) {
		setTime(millisecs);
	}
	
	public Time_15 (int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	
	private void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	private void setMinute(int minute) {
		this.minute = minute;
	}
	
	private void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime (long milliseconds) {
		long millisecondsToday = milliseconds % (1000 * 60 * 60 * 24);
		this.hour = (int)(millisecondsToday / (1000 * 60 * 60));
		this.minute = (int)(millisecondsToday % (1000 * 60 *60)) / (1000 * 60);
		this.second = (int)(millisecondsToday % (1000 * 60 * 60)) * (1000 * 60) / 1000;
	}
	
	public String toString() {
		return "Hour: " + hour + ", minutes " + minute + ", seconds " + second;
	}
	
	
	}


