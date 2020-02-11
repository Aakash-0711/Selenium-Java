package Week3.day1;

public class Car extends Vehicle {
	
	@Override
	public void applyBrake()
	{
		System.out.println("Brake is applied");
	}
	
	public void accelerator()
	{
		System.out.println("accelerator is applied");
	}
	
	public void soundhorn()
	{
		System.out.println("soundhorn");
	}
}

