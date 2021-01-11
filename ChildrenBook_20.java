package edu.smg03;

public class ChildrenBook_20 extends Book_20 {
	private int age;
	public ChildrenBook_20(double regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice, publisher, yearPublished);
		this.setAge(age);
	}
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}