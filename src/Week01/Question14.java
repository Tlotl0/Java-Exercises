package Week01;

/*program to print Firstname, LastName & age using static block, 
  static method & static variable*/
public class Question14 {
	static String FirstName;
	static String LastName;
	static int age;
	
	static {
		FirstName = "Karabo";
		System.out.println("First Name: " + FirstName);
	}
	
	public static void Question14(String str) {
		LastName = str;
		System.out.println("Last Name:" + LastName);
	}
	
	public static void main(String[] args) {
		age = 56;
		Question14.Question14(" Molokwe");;
		System.out.println("Age: " + age);
		
	}
	
}
