// Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop

package Assignment1.Program5;
import java.util.*;
public class Itearate_Array_List {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Array list iteration through for loop ");
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i)+ " ");
		}
		System.out.println("Array list iteration through while loop ");
		int i = 0;
		while(num.size()>i) {
			System.out.println(num.get(i));
			i++;
		}
		System.out.println("Array list iteration through advanced for loop ");
		for(Integer numbers:num) {
			System.out.println(numbers);
		}
	}
}
