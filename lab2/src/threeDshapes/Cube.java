package threeDshapes;

public class Cube extends Shape3D{
	private double side;
	public Cube() {};
	public Cube(double side) {
		this.side = side;
	}
	
	public double volume() {
		return Math.pow(side, 3);
	}
	public double surfaceArea() {
		return 6 * Math.pow(side, 2);
	}
	public String toString() {
		return "Side: " + side;
	}
}
