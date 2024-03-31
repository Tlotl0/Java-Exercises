package Week01;

import java.util.Scanner;


/*program to find the number of occurrences of a character in a string 
  without using loop*/
public class Question13 {

	public static void main(String[] args) {
		try {
			System.out.println("Please enter a word or string so we can count "
					+ "how many characters it has \n");
			Scanner sc = new Scanner(System.in);
			String str1 = sc.next(); //input string saved to variable
			System.out.println("now enter the character you want counted");
			String str2 = sc.next();
			//character chosen by user counted to see number of occurrences
			int count = str1.length() - str1.replace(str2, "").length();
			//(length of str1) - (length of str1 with no occurrences of str2
			sc.close();
			System.out.println(str2 + " appears " + count + " times in " + str1);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		
	}
	
}
