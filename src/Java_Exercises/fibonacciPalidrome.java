package Java_Exercises;

import java.util.Scanner;

//program to find out whether the input is Fibonacci or Palindrome
public class fibonacciPalidrome {

	public static void main(String[] args) {
		boolean b = false;
		while (b == !true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Whether You would like to test for Fibonocci"
				+ " Numbers of Palindrome Anagrams");
		String s = sc.next();


		if (s.equals("fibonacci")) {
			System.out.println("Enter an integer so we can evaluate if it is "
					+ "part of the fibonacci sequence");
			sc = new Scanner(System.in);
			int fibNum = sc.nextInt();
			boolean fib = isfibonacci(fibNum);
			if (fib == true) {
				System.out.println("The number you entered is a fibonacci number");
			} else {
				System.out.println("The number you entered is NOT a fibonacci number");
			}
		} else if (s.equals("palindrome")) {
			System.out.println("Enter an Anagram so we can evaluate if it is a"
					+ " Palindrome");
			sc = new Scanner(System.in);
			String sAna = sc.nextLine();

			boolean ana = isPalindrome(sAna);
			if (ana == true) {
				System.out.println("The anagram you entered is a palindrome");
			} else {
				System.out.println("The anagram you entered is not a palindrome");
			}
		}
		break;
		}

	}
	
	static boolean squareCheck(int x) {
		int s = (int)Math.sqrt(x);
		return (s*s == x);
	}
	
	//calculates whether integer is part of the fibonacci sequence
	static boolean isfibonacci(int m) {
		return squareCheck(m*m*5 + 4) || squareCheck(m*m*5 - 4);
	}
	
	//calculates whether string is a palidrome
	static boolean isPalindrome(String s) {
		String sReverse = new StringBuffer(s).reverse().toString();
		if (s.equals(sReverse)) {
			return true;
		} else {
			return false;
		}
	}

}
