// Write a program to create user defined exception and handle it.

package Assignment1.Program16;

public class MainException {
	public static void main(String args[]) {
		try {
			throw new User_defined_Exception("This is User defined message");
		}
		catch(User_defined_Exception e) {
			System.out.println(e);
		}
	}
}

