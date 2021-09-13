// Write a program to implement inheritance and method overiding together.

package Assignment1.Program17;

public class Employee {
	void show() {
		System.out.println("from employee class");
	}
}
class Employee1 extends Employee{

	@Override
	void show() {
		System.out.println("from employee1 class");
	}
}