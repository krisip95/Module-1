package edu.smg03;

public class Product_20 {
    private double regularPrice;
    
    public Product_20(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden
    public double computeSalePrice(){
        return 0;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
