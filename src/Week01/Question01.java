package Week01;

import java.util.Scanner;

//program to calculate area and perimeter of rectangle and circle
public class Question01 {
	

	public static void main(String... args) {
		Boolean b = false;
		while (b != true) {
			System.out.println("Welcome to the the shape calculator please enter "
					+ "whether you \n would like to calculate the area or perimeter of a square "
					+ "or a rectangle. \n  Type exit to close the program");
			Scanner sc = new Scanner(System.in);
			String scanned = sc.next();
			sc.close();
			String shape = "";
			switch (scanned) {
			case "Rectanlge":
			case "rectangle":
			case "RECTANGLE":
				shape = "rectangle";
				if (shape.equals("rectangle")) {
					System.out.println("please select whether you want to calculate "
							+ "the area or perimeter");
					sc = new Scanner(System.in);
					String scannedC = sc.next();
					sc.close();
					if (scannedC.equals("area")){
						System.out.println("Please enter the lenghts of the rectangle "
								+ "you would like calculate");
						sc = new Scanner(System.in);
						double aheight = sc.nextInt();
						sc.close();
						sc = new Scanner(System.in);
						double awidth = sc.nextInt();
						sc.close();
						double answer = rArea(aheight, awidth);
						System.out.println("The area of your rectangle is " + answer);
					} else if(scannedC.equals("circumference")) {
						System.out.println("Please enter the perimeter of the circle "
								+ "you would like calculate");
						sc = new Scanner(System.in);
						int cCircle = sc.nextInt();
						sc.close();
						double answer = cCircumference(cCircle);
						System.out.println("The circumference of your circle is " 
						+ answer);
					} else throw new IllegalArgumentException("Unexpected value: "
							+ "Please enter whether you want to calculate area "
							+ "or circumference");
				}
				break;
			
			case "Circle":
			case "circle":
			case "CIRCLE":
				shape = "Circle";
				System.out.println("please select whether you want to calculate"
						+ "the area or perimeter");
				sc = new Scanner(System.in);
				String scannedC = sc.next();
				sc.close();
				if (scannedC.equals("area")){
					System.out.println("Please enter the radius of the circle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					int aCircle = sc.nextInt();
					sc.close();
					double answer = cArea(aCircle);
					System.out.println("The area of your circle is " + answer);
				} else if(scannedC.equals("circumference")) {
					System.out.println("Please enter the radius of the circle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					int cCircle = sc.nextInt();
					sc.close();
					double answer = cCircumference(cCircle);
					System.out.println("The circumference of your circle is " 
					+ answer);
				} else throw new IllegalArgumentException("Unexpected value: "
						+ "Please enter whether you want to calculate area "
						+ "or circumference");
				break;
			
			case "exit":
			case "Exit":
			case "EXIT":
				b = true;
				System.out.println("Program Exiting....");
				System.out.println("Goodbye");
			
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: \n"
						+ "please enter either circle or rectangle");
			}
			
			if (shape.equals("circle")) {
				System.out.println("please select whether you want to calculate"
						+ "the area or perimeter");
				sc = new Scanner(System.in);
				String scannedC = sc.next();
				sc.close();
				if (scannedC.equals("area")){
					System.out.println("Please enter the radius of the circle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					int aCircle = sc.nextInt();
					sc.close();
					double answer = cArea(aCircle);
					System.out.println("The area of your circle is " + answer);
				} else if(scannedC.equals("circumference")) {
					System.out.println("Please enter the radius of the circle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					int cCircle = sc.nextInt();
					sc.close();
					double answer = cCircumference(cCircle);
					System.out.println("The circumference of your circle is " 
					+ answer);
				} else throw new IllegalArgumentException("Unexpected value: "
						+ "Please enter whether you want to calculate area "
						+ "or circumference");
			} else if (shape.equals("rectangle")) {
				System.out.println("please select whether you want to calculate "
						+ "the area or perimeter");
				sc = new Scanner(System.in);
				String scannedC = sc.next();
				sc.close();
				if (scannedC.equals("area")){
					System.out.println("Please enter the lenghts of the rectangle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					double aheight = sc.nextInt();
					sc.close();
					sc = new Scanner(System.in);
					double awidth = sc.nextInt();
					sc.close();
					double answer = rArea(aheight, awidth);
					System.out.println("The area of your rectangle is " + answer);
				} else if(scannedC.equals("circumference")) {
					System.out.println("Please enter the perimeter of the circle "
							+ "you would like calculate");
					sc = new Scanner(System.in);
					int cCircle = sc.nextInt();
					double answer = cCircumference(cCircle);
					System.out.println("The circumference of your circle is " 
					+ answer);
				} else throw new IllegalArgumentException("Unexpected value: "
						+ "Please enter whether you want to calculate area "
						+ "or circumference");
		}
		
	}}



	public static double cArea(double r) {
			double area = ((Math.PI)*(Math.pow(r, 2)));
			return area;
		}
	
	
	public static double cCircumference(double r) {
		double perimeter = (Math.PI*r*2);
		return perimeter;
	}
	
	public static double rArea(double height, double width) {
		double area = height*width;
		return area;
	}
	
	public static double rPerimeter(double height, double width) {
		double perimeter = (2*height*width);
		return perimeter;
	}
}

