package edu.smg03;

public class TV_20 extends Electronics_20 {
    
    int size;
    
    //Creates a new instance of TV
    public TV_20(double regularPrice, 
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
    
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }
}