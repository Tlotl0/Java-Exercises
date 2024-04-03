package Java_Exercises;

public class Table {
	synchronized void Multiplier(int m) {
		for (int i=1; i <= 5; ++i) {
			System.out.println(i + " x " + m + "= " + (i*m));
			try {
				Thread.sleep(i*50);
			} catch (Exception e) {
				System.out.println("Exception caught: " + e);
				}
		}
	}

}
