// Create interface for arithmatic operations

package Assignment1.Program13;

public class Perform_Operation implements Arithmetic_operation {
	public void addition(int x, int y) {
		int z  = x+y;
		System.out.println("Addition = "+z);
	}
	public void substraction(int x, int y) {
		int z  = x-y;
		System.out.println("Substraction = "+z);
	}
	public void multiplication(int x, int y) {
		int z  = x*y;
		System.out.println("Multiplication = "+z);
	}
	public void division(int x, int y) {
		int z  = x/y;
		System.out.println("Division = "+z);
	}
	public void show() {
		System.out.println("Arithmetic Calculations are: ");
	}
}
