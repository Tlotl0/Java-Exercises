package Week01;

import java.util.Scanner;


//program to replace a substring inside a string with other string
public class Question12 {

	public static void main(String... args) {
		String s = "The quick brown fox jumped over the lazy dog";
		System.out.println(s);
		System.out.println("Enter the word you would like to replace in the "
				+ "above statement \n");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		sc.close();
		System.out.println("Enter the word you would like to be added as a "
				+ "replacement in the ");
		String str2 = sc.next();
		sc = new Scanner(System.in);
		sc.close();
		String replaceString = s.replaceAll(str1, str2);
		System.out.println("The sentence now reads as: \n"
				+ replaceString);
	}

}
