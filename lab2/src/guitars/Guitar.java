package guitars;

public  class Guitar {
	protected String manufacturer;
	protected String color;
	protected int strings = 6;
	public Guitar(String manufacturer, String color) {
		this.manufacturer = manufacturer;
		this.color = color;
	}
	public Guitar(String manufacturer, String color, int strings) {
		this(manufacturer, color);
		this.strings = strings;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getColor() {
		return color;
	}
	public int getStrings() {
		return strings;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setStrings(int strings) {
		this.strings = strings;
	}
	public String toString() {
		return "Manufacturer: " + manufacturer + " Color: " + color + " Number of strings: " + strings;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Guitar g = (Guitar) o;
		return (strings == g.strings) && (manufacturer.equals(g.manufacturer)) && (color.equals(g.color));
	}
	public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + strings;
        return result;
    }
}
