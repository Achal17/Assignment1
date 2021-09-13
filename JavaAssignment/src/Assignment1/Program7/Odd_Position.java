// Create a method to print the elements of an array present on odd position

package Assignment1.Program7;

public class Odd_Position {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println("Elements of an array present on odd position are:");
		for(int i=0;i<arr.length;i+=2) {
			System.out.println(arr[i]);
		}
	}
}
