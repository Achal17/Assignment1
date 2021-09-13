// Write a program to implement static block, static method and static variables.
//To understand Static control flow

package Assignment1.Program19;

public class StaticControlFlow {
	static int a=100;
	static int b=200;
	public static void main(String[] args) {
		print();
		System.out.println("Inside main method");
	}
	static {
		System.out.println(a);
		print();
		System.out.println("Inside first static block");
	}
	public static void print() {
		System.out.println(b);
	}
	static {
		System.out.println("Inside second static block");
	}
}
//Firstly i go with the concept of static control flow.
// Then do the coding. I understood the concept now.