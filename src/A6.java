
/**
 * 
 * @author franz perez
 * 
 * Email: Franz.perez290@gmail.com
 *This is assignment6 for CSC200 NVCC Spring 2015 Semester
 * Descriprion: To program to test all the operations on the class A6.
 */


public class A6 {

	//initializing the instance variables
	private String day;
	private String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	/**
	 * constructor for creating the Day object with no parameters
	 */
	public A6() {
		this.day = "Mon";
	}
	/**
	 * constructor for creating the Day object by entering the day of the week
	 * day of the week
	 */
	public A6(String day) {
		this.day = day;
	}
	/**
	 * get method for the Day object
	 * return day of the week
	 */
	public String getDay() {
		return day;
	}
	/**
	 * set method for the Day object
	 *  day of the week
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * get method for the array index
	 * day of the week
	 * return array index
	 */
	private int getDayIndex(String day) {
		for(int i = 0; i < days.length; i++) {
			if (days[i] == this.day) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * method for adding days to the day of the week
	 * number of days to add
	 * return new day of the week
	 */
	public String calculateDay(int num) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex != -1) {
			message = days[(dayIndex + num) % 7];
		}
		else {
			message = "Invalid Day!";
		}
		return message;
	}
	/**
	 * method to get the previous day of the week
	 * return previous day of the week
	 */
	public String previousDay() {
		if(getDayIndex(this.day) == 0) {
			return calculateDay(6);
		}
		else{
			return calculateDay(-1);
		}
	}
	/**
	 * method to get the next day of the week
	 * return next day of the week
	 */
	public String nextDay() {
		return calculateDay(1);
	}
	/**
	 * overrides 
	 */
	public String toString() {
		return "Day: " + day;
	}
}
