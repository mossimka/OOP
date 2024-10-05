package first;

public class Animal {
	String name;
	int weight;
	String color;
	public Animal() {};
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int weight) {
		this(name);
		this.weight = weight;
	}
	public Animal(String name, int weight, String color) {
		this(name, weight);
		this.color = color;
	}
	public String sleep(int time) {
		return("Animal has been sleeping for " + time + "hours.");
	}
	public String sound(String sound) {
		return("It sounds like: " + sound);
	}
	public String toString() {
		return "Animal: " + name + " Weight: " + weight + " Color: " + color;
	}
}
