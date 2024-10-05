package week2;

public class Time {
	public int hours;
	public int minutes;
	public int seconds;
	public AmPm type = AmPm.AM;
	
	public Time(int inputHours, int inputMinutes, int inputSeconds) {
		this.hours = inputHours;
		this.minutes = inputMinutes;
		this.seconds = inputSeconds;
		if(inputHours > 12) {
			this.type = AmPm.PM;
		}
	}
	public String toUniversal() {
		String s = new String();
		s = s + hours + ' ' + minutes + ' ' + seconds + ' ';
		return s;
	}
	public String toStandart() {
		String s = new String();
		this.hours = hours - 12;
		s = s + hours + ' ' + minutes + ' ' + seconds + ' ' + type.toString();
		return s;
	}
}
