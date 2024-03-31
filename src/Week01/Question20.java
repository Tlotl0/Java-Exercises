package Week01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//program using while, dowhile, for & foreach loops
public class Question20 {

	public static void Printer(int x) {
		int i = 0;
		List<Integer> list = new ArrayList<Integer>();
		do {
			System.out.println("Hello World");
			++i;
			list.add(i);
		} while (i < x);
		list.forEach((a) -> System.out.println(a));
		}

	
	public static void main(String[] args) {
		boolean b = false;
		while (b != true) {
			System.out.println("please enter the number of times you would like "
					+ "hello world printed \n");
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			Printer((int) j);
			sc.close();
			b = true;
		}
	}

}
