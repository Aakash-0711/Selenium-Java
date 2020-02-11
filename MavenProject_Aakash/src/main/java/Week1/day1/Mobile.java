package Week1.day1;

public class Mobile {
	
	private String model="nokia";
	private String color="red";
	private float price= 2000f;
	
	
	public String getModel()
	{
		return model;
	}
    public String getcolor()
    {
    	return color;
    }
    public float getprice(float discount)
    {
    	return price-discount;
    }
    public void addphonenumber(long number)
    {
System.out.println(number);   
}
}
