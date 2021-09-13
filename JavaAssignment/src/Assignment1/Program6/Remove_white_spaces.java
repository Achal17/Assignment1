// Write a Java Program to remove all white spaces from a string without using replace()

package Assignment1.Program6;
import java.util.*;
public class Remove_white_spaces {
	public static void main(String[] args) {
		String str1 = "My name is Achal";
		String str2 = "";
		Scanner sc = new Scanner(str1);
		while(sc.hasNext()) {
			str2 += sc.next();
		}
		for(char c:str1.toCharArray()) {
			if(c!=' ') {
				System.out.print(c);
			}
	}
}
}
