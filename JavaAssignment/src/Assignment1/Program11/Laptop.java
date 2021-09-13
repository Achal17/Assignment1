// Program for Composition

package Assignment1.Program11;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
	}
	public Laptop(float screen, Processor processor,String ram) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
	}
	public String toString() {
		return("Laptop screen = "+screen+" processosr = "+processor+" Ram = "+ram);
	}
	public float getScreen() {
		return screen;
	}
	public Processor getProcessor() {
		return processor;
	}
	public String getRam() {
		return ram;
	}

}
