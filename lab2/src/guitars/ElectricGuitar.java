package guitars;

public class ElectricGuitar extends Guitar{
	private int numOfPickups;
	public ElectricGuitar(String manufacturer, String color, int strings, int numOfPickups) {
		super(manufacturer, color, strings);
		this.numOfPickups = numOfPickups;
	}
	public int getNumOfPickups() {
		return numOfPickups;
	}
	public void setNumOfPickups(int numOfPickups) {
		this.numOfPickups = numOfPickups;
	}
	public String toString() {
		return super.toString() + " Number of pickups: " + numOfPickups;
	}
	public boolean equals(Object o) {
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    if (!super.equals(o)) return false;
	    ElectricGuitar that = (ElectricGuitar) o;
	    return numOfPickups == that.numOfPickups;
	}
	public int hashCode() {
		return 31 * super.hashCode() + numOfPickups;
    }
}
