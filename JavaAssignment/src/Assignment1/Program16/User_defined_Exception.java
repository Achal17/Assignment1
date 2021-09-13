// Write a program to create user defined exception and handle it.

package Assignment1.Program16;

public class User_defined_Exception extends Exception {
	String message;
	User_defined_Exception(String str){
		message=str;
	}
	public String toString() {
		return("User defined Exception occured: "+ message);
	}
}


