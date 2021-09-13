// Program for Abstraction
package Assignment1.Program2;

public class Abstraction {
	public static void main(String[] args) {
	Bank b1 = new Sbi(7);
	Bank b2 = new Hdfc(8);
	System.out.println("Sbi rate of interest is "+b1.getInterestRate());
	System.out.println("Hdfc rate of interest is "+b2.getInterestRate());
	}
}