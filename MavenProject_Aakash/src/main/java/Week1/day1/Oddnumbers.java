package Week1.day1;

public class Oddnumbers {

	public static void main(String[] args) {
		int i=0;
for (int j = 1; j <=100; j++) {
	
	if(j%2!=0)
	{
		i=i+j;
	}

}
System.out.print("Sum of odd numbers:" + i);
	}
}
