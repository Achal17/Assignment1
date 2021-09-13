//Write a Java Program to find the second-highest number in an array
package Assignment1.Program4;
import java.util.*;

public class SecondLargestInArray {
	static void second_largest(int arr[],int arr_size) {
		int i;
		if(arr_size<2) {
			System.out.println("Invalid Input");
			return;
		}
		 Arrays.sort(arr);
		 for(i=arr_size-2;i>=0;i--) {
			 if (arr[i] != arr[arr_size - 1])
			    {
			      System.out.printf("The second largest " + "element is %d \n", arr[i]);
			      return;
			    }
		 }
		 System.out.printf("There is no second " + "largest element\n");
	}
	public static void main(String[] args) {
		int arr[]= {1,5,2,9,8,80};
		int n = arr.length;
		second_largest(arr,n);
	}
}
