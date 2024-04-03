package Java_Exercises;

import java.util.Scanner;

//program to return details of Bank name, rate of interest, number of branches

public class bankDetailsTracker extends Bank {
	//extend bank class to allow working with subclasses
	public static void main(String... args) {
		boolean b = false;
		while (b != true) {
			System.out.println("There are 4 banks available: HDFC, CITI, Axis, ICICI \n"
					+ "Please enter the bank name to view thier details"
					+ "Or press exit to leave the program \n");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
//			sc.close();
			//switch statements to predict input and display appropriate data 
			switch (str) {
			case "HDFC":
			case "hdfc":
			case "Hdfc":
				HDFC bank = new HDFC();
				bank.getDetails();
				break;
			case "CITI":
			case "citi":
			case "Citi":
				CITI bank1 = new CITI();
				bank1.getDetails();
				break;
			case "Axis":
			case "AXIS":
			case "axis":
				Axis bank2 = new Axis();
				bank2.getDetails();
				System.out.println();
				break;
			case "ICICI":
				ICICI bank3 = new ICICI();
				bank3.getDetails();
				break;
			case "Exit":
			case "EXIT":
				System.out.println("Program Exiting.... \n Goodbye");
				b = true;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + str);
			}
		}
		
	}

}
