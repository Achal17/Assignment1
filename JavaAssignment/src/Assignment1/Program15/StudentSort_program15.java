// Create Student class, get 10 students and create a function for sort by age, sort by marks, find by address.

package Assignment1.Program15;

import java.util.TreeMap;

public class StudentSort_program15 {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("21","Achal");
        t.put("25","Sonali");
        t.put("21","Kanchan");
        t.put("25","Nimish");
        t.put("18","Chanchal");
        t.put("54","Bhagyashri");
        t.put("56","Muskan");
        t.put("11","Pooja");
       
       
        //Sort accoring to age
        System.out.println(t);
	}

}
