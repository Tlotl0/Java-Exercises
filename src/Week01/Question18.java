package Week01;


import java.util.ArrayList;
import java.util.List;

//programs to throw exceptions.
public class Question18 {

	public static void main(String[] args) {

		/*classWithInitErrors initialization causes noClassDefFoundError 
		 * exception to be thrown
		 */
		List<classWithInitErrors> errList = new ArrayList<classWithInitErrors>(2);
		for (int i = 0; i < 2; i++) {
			try {
				errList.add(new classWithInitErrors (String.valueOf(i)));
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		System.out.println(); //separate error statements
		
		/*trying to read a class with forName() that doesn't exist will cause
		 * a ClassNotFound exception to be thrown
		 */
		try {
			Class.forName("com,mysql.cj.jdbc.Driver");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//trying to print objects beyond array size will cause
				try {
					int[] j = {1,2,3,4,5};
					System.out.print(j[89]);
				} catch (Throwable e) {
					e.printStackTrace();
					System.out.println();
				}
		
		/*trying to find the String length with a value of null causes 
		 * a NullPointerException to be thrown
		 */
		try {
			String str = null;
			int i = str.length();
			System.out.println(i);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
	}
}


