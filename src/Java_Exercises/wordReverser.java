package Java_Exercises;


/*program to reverse a string and remove character from index 4 to index 9 
  from the reversed string */
public class wordReverser {

	public static void main(String[] args) {

		String str = "extraordinary";
		System.out.println(str);
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		System.out.println("String reversed: " + s);
		s.delete(4, 9);
		System.out.println("String character from 4 to 9 deleted: " + s);
	}

}
