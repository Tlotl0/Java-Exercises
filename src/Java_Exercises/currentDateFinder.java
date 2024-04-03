package Java_Exercises;

import java.time.LocalDateTime;

//program to format date dd-mm-yy
public class currentDateFinder {

	public static void main(String... args) {
		LocalDateTime currentDay = LocalDateTime.now();
		System.out.println("Today it is " + currentDay.getDayOfMonth() + "-" + 
		currentDay.getMonth() + "-" + currentDay.getYear());

	}

}
