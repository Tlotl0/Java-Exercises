package Java_Exercises;

import java.util.Scanner;


//program to parse string to integer using try, catch block
public class integerCatchBlocker {

	public static void main(String[] args) {
		int i = 0;
		try {
			System.out.println("Please enter any number to have it read back to you");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			sc.close();
			i = Integer.parseInt(str);
	} catch (NumberFormatException e) {
		System.out.println("Exeception caught: " + e.getMessage());
		
	} finally {
		System.out.println("Parsed interger = " + i);
	}
	}

}
