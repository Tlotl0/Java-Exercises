package Week01;

//program for following operation using overloading 
public class Question16 {
	//overload methods created to handle each calculation
	public int Question16(int i, int j) {
		return (i+j);
	}
	
	public double Question16(double i, double j) {
		return (i+j);
	}
	
	public float Question16(float i, float j) {
		return (i*j);
	}
	

	
	public String Question16(String i, String j) {
		String str = i.concat(j);
		return str;
	}
	
	public String Question16(String i, String j, String k) {
		String str1 = i.concat(j).concat(k);
		return str1;
	}
	
	
	public static void main(String... args) {
		Question16 input = new Question16();
		System.out.println(input.Question16(2, 3));
		System.out.println(input.Question16(2.6, 4.7));
		System.out.println(input.Question16(8.72f, 9.65f));
		System.out.println(input.Question16("Method ", "Overloading"));
		System.out.println(input.Question16("Java ", "Method ", "Overloading"));
		
		
	}

}
