package Java_Exercises;


/*static initialisation of classWithInitErrors causes ExceptionInitializerError 
 * which triggers noClassDefFoundError during class loading
 */
public class classWithInitErrors {
	private static String errStr = getErrStr();
	
	
	public classWithInitErrors(String err) {
		this.errStr = err;
	}
	
	private static String getErrStr() {
		throw new RuntimeException("User ID not found");
	}
}
