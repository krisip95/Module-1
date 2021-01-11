package edu.smg03;

public class MP3Player_20 extends Electronics_20{
    
    private String color;
    
    public MP3Player_20(double regularPrice, 
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
    
    // Implement the abstract method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}