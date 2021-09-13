// Find occurance of character in String without using for loop.

package Assignment1.Program12;

public class Occurance_of_Character {
	static int countOccurance(String str, char ch) {
		if(str.length()==0)
			return 0;
		int count=0;
		if(str.charAt(0)==ch)
			count++;
			count+=countOccurance(str.substring(1),ch);
		return count;
	}
	public static void main(String[] args) {
		String str = "perficient";
		char ch = 'i';
		System.out.println("The character "+ch+" occurs "+countOccurance(str,ch)+" times");
	}
}
