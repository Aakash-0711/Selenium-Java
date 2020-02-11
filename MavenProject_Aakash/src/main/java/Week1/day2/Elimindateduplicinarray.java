package Week1.day2;

import java.util.Arrays;

public class Elimindateduplicinarray {

	public static void main(String[] args) {
    int arr[]= {1,2,1,22,23,34,44,33,34,22,1,34};
   int len = arr.length;
   for (int i = 0; i < len; i++) {
	   for (int j = i+1; j < len; j++) {
		   if(arr[i]==arr[j]) {
			   arr[j]=arr[len-1];
		   len--;
		   j--;
		   }
		
	}
	
   }
int[] arr1=Arrays.copyOf(arr, len);
for (int j = 0; j < arr1.length; j++) {
	Arrays.sort(arr1);
	System.out.print(arr1[j]+ " ");
}

}

}
