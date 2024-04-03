package Java_Exercises;

/*program to print Firstname, LastName & age using static block, 
  static method & static variable*/
public class kycCollector {
	static String FirstName;
	static String LastName;
	static int age;
	
	static {
		FirstName = "John";
		System.out.println("First Name: " + FirstName);
	}
	
	public static void kycCollector(String str) {
		LastName = str;
		System.out.println("Last Name:" + LastName);
	}
	
	public static void main(String[] args) {
		age = 56;
		kycCollector.kycCollector("Doe");;
		System.out.println("Age: " + age);
		
	}
	
}
