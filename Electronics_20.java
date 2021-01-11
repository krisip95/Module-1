package edu.smg03;

	public abstract class Electronics_20 extends Product_20{
	    
	    private String manufacturer;
	    
	    //Creates a new instance of Electronics
	    public Electronics_20(double regularPrice,
	            String manufacturer) {
	        super(regularPrice);
	        this.manufacturer = manufacturer;
	    }
	    
	    public String getManufacturer() {
	        return manufacturer;
	    }
	    
	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }
}