// Program for inheritance
package Assignment1.Program2;

public class Car extends Machine {
	int milege;
	public Car(int m) {
		this.milege = m;
	}
	public void start() {
		System.out.println("car is started and having "+milege+" milege ");
	}
	public void clean() {
		System.out.println("car cleaned");
	}

}
