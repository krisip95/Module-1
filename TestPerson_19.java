package edu.smg03;

import java.util.Date;

public class TestPerson_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_19 p = new Person_19("Taeyong", "Itaewon", "0123456789", "tyong@gmail.com");
		Student_19 s = new Student_19("Taeyong", "Itaewon", "0123456789", "tyong@gmail.com","senior");   //zaplata
		Employee_19 e = new Employee_19("Jackson", "Trimage", "0123456789", "jcks@gmail.com","office 7", 1000, "11:00-18:00");
		Faculty_19 f = new Faculty_19("Jungkook", "Gangnam", "0123456789", "jk@gmail.com","office 7", 666, null, "11:00-18:00", 1);
		Staff_19 st = new Staff_19("Taeyong", "Itaewon", "0123456789", "tyong@gmail.com","office 23", 1234, null, "11:00-18:00");
		System.out.println(p.toString());
//		System.out.println();
		System.out.println(s.toString());
//		System.out.println();
		System.out.println(f.toString());
//		System.out.println();
		System.out.println(st.toString());
		System.out.println(e.toString());
	}

}