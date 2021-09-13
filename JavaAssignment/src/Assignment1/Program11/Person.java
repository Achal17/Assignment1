// Program for Aggregation.

package Assignment1.Program11;

public class Person {
	private Job job;
	
	public Person(Job job){
		this.job = job;
		job.setSalary(100);
	}
	public long getSalary() {
		return job.getSalary();
	}
	public String getRole() {
		return job.getRole();
	}
}
