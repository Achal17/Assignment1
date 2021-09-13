// Create interface for calculating simple interest for different bank.

package Assignment1.Program14;

public class Main_program14 {
	public static void main(String[] args) {
		SimpleInterest si1 = new Axis();
	    si1.CalculateInterest(8000, 6, 2);
	    System.out.println("\n");
	    SimpleInterest si2 = new Maharashtra();
	    si2.CalculateInterest(10000, 8, 1);
	}
}
