package Java_Exercises;


/*program to synchronize between multiple threads trying to access method 
  at the same time.
 */
public class multipleThreadObserver {
	public static void main(String... args) {
		final Table obj = new Table();
		synchThread thr1 = new synchThread(obj);
		synchThread thr2 = new synchThread(obj);
		thr1.start();
		thr2.start(); /* threads initialized at the same time but threads run
		one after the other*/
		
	}
}
