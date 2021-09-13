// Write a program to print the rollNo and names of students by creating a Student class.
// If no rollno and name  is passed while creating an object of Student class, then the name should be "Unknown" and rollNo shouble be "000", 
//otherwise the name and rollno should be equal to the String value passed while creating object of Student class.
package Assignment1.Program9;

public class Student_Program9 {
	int rollNo;
	String name;
	Student_Program9(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("Roll no= "+rollNo+" & Name = "+name);
	}
	Student_Program9() {
		rollNo = 000;//Blocker it just print 0 instead of 000.
		name = "Unknown";
		System.out.println("Roll no= "+rollNo+" & Name = "+name);
	}
}
