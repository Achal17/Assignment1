// Create interface for calculating simple interest for different bank.

package Assignment1.Program14;

public class Axis implements SimpleInterest {

	@Override
	public void CalculateInterest(double p, double r, double t) {
		double si = (p*r*t)/100;
		System.out.println("Simple interest of Axis bank = "+si);
		
		
	}
	
}
