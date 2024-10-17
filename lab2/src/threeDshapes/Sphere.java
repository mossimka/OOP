package threeDshapes;

public class Sphere {
	double radius;
	public Sphere() {};
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	public String toString() {
		return "Radius: " + radius;
	}
}
