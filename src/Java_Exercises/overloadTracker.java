package Java_Exercises;

//program for following operation using overloading 
public class overloadTracker {
	//overload methods created to handle each calculation
	public int overloadTracker(int i, int j) {
		return (i+j);
	}
	
	public double overloadTracker(double i, double j) {
		return (i+j);
	}
	
	public float overloadTracker(float i, float j) {
		return (i*j);
	}
	

	
	public String overloadTracker(String i, String j) {
		String str = i.concat(j);
		return str;
	}
	
	public String overloadTracker(String i, String j, String k) {
		String str1 = i.concat(j).concat(k);
		return str1;
	}
	
	
	public static void main(String... args) {
		overloadTracker input = new overloadTracker();
		System.out.println(input.overloadTracker(2, 3));
		System.out.println(input.overloadTracker(2.6, 4.7));
		System.out.println(input.overloadTracker(8.72f, 9.65f));
		System.out.println(input.overloadTracker("Method ", "Overloading"));
		System.out.println(input.overloadTracker("Java ", "Method ", "Overloading"));
		
		
	}

}
