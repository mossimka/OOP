package first;

public class Bird extends Animal{
	int wingspan;
	public Bird() {
		super();
	};
	public Bird(String name) {
		super(name);
	};
	public Bird(String name, int weight, String color) {
		super(name, weight, color);
	};
	public Bird(String name, int weight, String color, int wingspan) {
		super(name, weight, color);
		this.wingspan = wingspan;
	};
	public String sleep(int time) {
		return("Brid has been sleeping for " + time + "hours.");
	}
	public String toString() {
		return "Bird: " + name + " Weight: " + weight + " Color: " + color + " Wingspan: " + wingspan;
	}
}
