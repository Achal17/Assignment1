// Write a program for encapsulation
package Assignment1.Program1;

public class TestEncapsulation_Program1 {
	public static void main(String[] args) {
		Encapsulation_Program1 e = new Encapsulation_Program1();
		e.setAge(21);
		e.setName("Achal");
		e.setRollno(48255);
		System.out.println("Student's name = "+e.getName());
		System.out.println("Student's age = "+e.getAge());
		System.out.println("Student's rollno = "+e.getRollno());
	}
}
