package problem2;

public class Pen {
	private final int stSize = 150;
	private int size = stSize;
	private static int counterId = 0;
	private int id;
	private String color = "clear";
	public String inkColor = "blue";
	public Pen() {
		id = counterId;
		counterId++;
	}
	public Pen(String color, String inkColor) {
		this();
		this.color = color;
		this.inkColor = inkColor;
	}
	public Pen(String color, String inkColor, int sizeCoef) {
		this(color, inkColor);
		size = stSize * sizeCoef;
	}
	public String printPen() {
		return id + " " + color + " " + inkColor + " " + size; 
	}
}