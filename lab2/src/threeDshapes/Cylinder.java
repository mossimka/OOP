package threeDshapes;

public class Cylinder extends Shape3D {
	private double height, radius;
	public Cylinder() {};
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	public double surfaceArea() {
		return Math.PI * Math.pow(radius, 2) * 2 + 2 * Math.PI * radius * height;
	}
	public String toString() {
		return "Height: " + height + " Radius:" + radius;
	}
}
