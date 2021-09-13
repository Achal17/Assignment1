// Write a Java Program to reverse a string without using String inbuilt function

package Assignment1.Program8;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string to reverse:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("The reverse string is:");
		for(int i=str.length();i>0;i--) {
			 System.out.print(str.charAt(i-1));
		}
	}
}
