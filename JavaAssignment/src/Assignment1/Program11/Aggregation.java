// Program for Aggregation.

package Assignment1.Program11;

public class Aggregation {
public static void main(String[] args) {
		
		Job job = new Job();
		job.setRole("Intern");
		job.setSalary(100000);
		Person person = new Person(job);
		person.getSalary();
		System.out.println("Salary is "+ person.getSalary()+" Role is "+person.getRole());
	}
}
