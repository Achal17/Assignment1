//Program for Inheritance
package Assignment1.Program2;

public class TestInheritance {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		Car car1 = new Car(500);
		car1.start();
		car1.clean();
		car1.stop();
	}
}
