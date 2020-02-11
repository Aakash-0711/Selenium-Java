package Week1.day1;

public class Primenumbers {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		String c="";
		for ( i = 0; i <=100; i++) {
			int count=0;
			for (j = i; j>=1; j--) {
				if(i%j==0)
				{
					count=count+1;
				}
				
			}
			if(count==2)
			{
				c=c+i+" ";
			}
		}
		
System.out.print("Prime num bet 1 to 100: " + c);
	}

}
