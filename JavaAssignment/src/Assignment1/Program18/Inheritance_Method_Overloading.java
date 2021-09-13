// Write a program to implement inheritance and method overloading together.

package Assignment1.Program18;

public class Inheritance_Method_Overloading {
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(12, 13));
		System.out.println(s.sum(12, 13, 14));
		System.out.println(s.sum(12.5, 13.5));
	}
}
