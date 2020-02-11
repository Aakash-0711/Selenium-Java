package Week1.day1;

public class Calc {

	int a;
	int b;
	int c;
	public void add(int a, int b)
	{
		c=a+b;
		System.out.println("Addition " + c);
	}
	public void sub(int a, int b)
	{
		 c=a-b;
		System.out.println("sub " + c);
	}
	public void mul(int a, int b)
	{
		c=a*b;
		System.out.println("mul " + c);
	}
	public void div(int a, int b)
	{
		c=a/b;
		System.out.println("div " + c);
	}
	public static void main(String[] args) {
		
		Calc c=new Calc();
		System.out.println("Calculator");
		c.add(10, 30);
		c.sub(10, 5);
		c.mul(5, 10);
		c.div(20, 2);
		
		//System.out.println(c.add(10, 20));
	//System.out.println("Addition"+ Result);

	}

}
