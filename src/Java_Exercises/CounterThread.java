package Java_Exercises;

// CounterThread  method creates class objects which create threads 
public class CounterThread extends Thread {
	@Override
	public void run() {
		System.out.println(this.getName() + "..... has started");
		for (int i=0; i < 5; ++i) {
			try {
				Thread.sleep(i*200);
			} catch (Exception e) {
				System.out.println("Exception Reached: " + e);
			}
		}
		System.out.println(this.getName() + " has ended its run");
	}
	
}
