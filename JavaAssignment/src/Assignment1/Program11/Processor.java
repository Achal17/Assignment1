// Program for Composition

package Assignment1.Program11;

public class Processor {
	private String brand;
	private int generation;
	public Processor() {
		this.brand = "Intel";
		this.generation = 10;
	}
	public Processor(String brand,int generation) {
		this.brand = brand;
		this.generation = generation;
	}
	public String toString() {
		return("Processor brand = "+brand+"Generation = "+generation);
	}
	public String getBrand() {
		return brand;
	}
	public int getGeneration() {
		return generation;
	}
}
