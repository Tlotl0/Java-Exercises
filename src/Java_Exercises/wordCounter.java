package Java_Exercises;

import java.util.Scanner;

//method to take a string and return the number of unique characters in the string.
public class  wordCounter {
	public static int parseString(String s) {
		char[] cArr = s.toCharArray();
		int count  = cArr.length;
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Please enter a word so we can count "
				+ "how characters it has \n");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int i = parseString(str);
		System.out.println("Your word " + str + " has " + i + " characters");

	}

}
