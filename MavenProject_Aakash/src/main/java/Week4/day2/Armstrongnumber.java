package Week4.day2;

public class Armstrongnumber {
	
	public void isarmstrong(int num) {
		int cube = 0;
		int r;
		int t;
		t=num;
		
		while(num > 0) {
			r=num%10;
			num=num/10;
			cube= cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("Armstrong number");
		}else
		{
			System.out.println("Not Armstrong number");
		}
	}

	public static void main(String[] args) {
	  Armstrongnumber n=new Armstrongnumber();
	  n.isarmstrong(155);
	}

}
