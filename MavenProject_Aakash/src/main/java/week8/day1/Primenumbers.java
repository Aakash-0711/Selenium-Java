package week8.day1;

public class Primenumbers {
	
	public static boolean isprimenumber(int num){
		if(num<=1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void prime(int num) {
		for (int i = 2; i <=num; i++) {
			if(isprimenumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		
        System.out.println(isprimenumber(10));
        prime(100);
	}

}
