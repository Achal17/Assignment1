// Write a program which will compare two arrays. The common elements among these two arrays will display first
//and uncommon elements from first array will display at last.

package Assignment1.Program10;
import java.util.*;
public class Compare_two_arrays {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,3,2,8};
		int n1 = arr1.length;
		int n2 = arr2.length;
		ArrayList<Integer> num =new ArrayList<Integer>();
		   //common elements
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(arr1[i]==arr2[j]) {
					num.add(arr1[i]);
					arr1[i]=arr2[i]=0;
					
					break;
				}
			}
		}
		//System.out.println(num);
		 //uncommon elements
		for(int i=0;i<n1;i++) {
			if(arr1[i]!=0) {
				num.add(arr1[i]);
			}
		}
		System.out.println(num);
	}
}
		        
		    
		        