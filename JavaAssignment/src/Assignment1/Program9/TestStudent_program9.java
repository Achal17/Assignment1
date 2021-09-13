// Write a program to print the rollNo and names of students by creating a Student class.
// If no rollno and name  is passed while creating an object of Student class, then the name should be "Unknown" and rollNo shouble be "000", 
//otherwise the name and rollno should be equal to the String value passed while creating object of Student class.

package Assignment1.Program9;

public class TestStudent_program9 {
	public static void main(String[] args) {
		Student_Program9 student1 = new Student_Program9(101,"Achal");
		Student_Program9 student2 = new Student_Program9();
	}
}
