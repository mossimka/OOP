package problem1;

public class Data {
	 private double sum;
	 private double max;
	 private int count;
	 public Data() {
	     sum = 0;
	     max = Double.NEGATIVE_INFINITY;
	     count = 0;
	 }
	 public void addValue(double value) {
	     sum += value;
	     if (value > max) {
	         max = value;
	     }
	     count++;
	 }
	 public double getAverage() {
	     if (count == 0) {
	         return 0;
	     }
	     return sum / count;
	 }
	 public double getMaximum() {
	     if (count == 0) {
	         return 0;
	     }
	     return max;
	 }
	 public String toString() {
		 return sum + " " + max + " " + count;
	 }
}