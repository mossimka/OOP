package problem3;

public class Temperature {
	private double value;
	private char scale;
	public Temperature() {
		value = 0;
		scale = 'C';
	}
	public Temperature(double temper) {
		this.value = temper;
		scale = 'C';
	}
	public Temperature(char temperType) {
		value = 0;
		this.scale = temperType;
	}
	public Temperature(double temper, char temperType) {
		this.value = temper;
		this.scale = temperType;
	}
    public char getScale() {
        return scale;
    }
	public double inCelsius(){
		if(scale == 'C') {
			return value;
		}
	
		return 5 * (value - 32) / 9;;
	}
	public String CelsiusToFahrenheit(){
		value = 9 * (value / 5) + 32;
		return "Convertation completed!";
	}
	public String print() {
		return value + " " + scale;
	}
	
}
