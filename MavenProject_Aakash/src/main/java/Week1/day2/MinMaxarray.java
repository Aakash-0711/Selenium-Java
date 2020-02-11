package Week1.day2;

import java.util.Arrays;

public class MinMaxarray {

	public static void main(String[] args) {
		int[] arr = {3,2,1,4,6,7,25};
		Arrays.sort(arr);
		//System.out.println(arr);
		//int maxnum=arr.length-1;
		System.out.println("Max num " + arr[arr.length-1]);
		System.out.println("min num "  + arr[0]);

	}

}

