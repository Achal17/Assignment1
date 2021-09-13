// Program for composition

package Assignment1.Program11;

public class Composition {
	public static void main(String args[]) {
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());
	}
}
