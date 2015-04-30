/**
 * 
 * @author franz perez
 * Email:Franz.perez290@gmail.com
 *This is assignment6 for CSC200 Class NVCC Spring 2015 Semester
 * Description: a program to test all the operations on the class A6.
 *
 */

public class A6Driver {

	//main method
	public static void main(String [] args) {
		//initializing the Day object
		A6 day = new A6();
		//testing the methods from the Day class
		System.out.println(day.toString());
		System.out.println("Get Day: " + day.getDay());
		System.out.println("Next Day: " + day.nextDay());
		System.out.println("Previous Day: " + day.previousDay());
		System.out.println("Add 8 Days: " + day.calculateDay(8));
		day.setDay("Sun");
		System.out.println(day.toString());
		System.out.println("Get Day: " + day.getDay());
		System.out.println("Next Day: " + day.nextDay());
		System.out.println("Previous Day: " + day.previousDay());
		System.out.println("Add 12 Days: " + day.calculateDay(12));
	}
}