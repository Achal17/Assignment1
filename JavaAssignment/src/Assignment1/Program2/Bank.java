// Program for Abstraction
package Assignment1.Program2;

public abstract class Bank {
	int interestRate;
	abstract int getInterestRate();
	
	public Bank(int interestRate) {
		this.interestRate = interestRate;
	}
}
class Sbi extends Bank{
	public Sbi(int interestRate) {
		super(interestRate);
	}

	int getInterestRate() {
		return interestRate;
	}
}
class Hdfc extends Bank{

	public Hdfc(int interestRate) {
		super(interestRate);
	}
	int getInterestRate() {
		return interestRate;
	}
}

