// Write a program for encapsulation

package Assignment1.Program1;

public class Encapsulation_Program1 {
	private int rollno;
	private String name;
	private int age;
		
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setAge(int newage) {
		age = newage;
	}
	public void setName(String newname) {
		name = newname;
	}
	public void setRollno(int newrollno) {
		rollno=newrollno;
	}	
}
