package Week01;

import java.util.Scanner;

/*method that takes a string and print the number of occurrences of each 
  character in the string.
 */
public class Question04 {
	public static void parseS(String s) {
		char[] cArr = s.toCharArray();
		int count  = 0;
		for (int i = 0; i < cArr.length; ++i) {
			for (int j = 0; j < cArr.length; ++j) {
				if (cArr[j] == cArr[i]) {
					++count; 
				}
			}
			System.out.println(cArr[i] + " has " + count + " characters");
			count = 0;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Please enter a word so we can count "
				+ "how characters it has \n");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		parseS(str);
		sc.close();

	}
}
