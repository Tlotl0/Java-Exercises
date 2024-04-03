package Java_Exercises;

//program to print triangle pattern
public class starTriangle {
	public static void main(String... args) {
		int i;
		for (i = 0; i < 10; i++) {
			if ((i % 2) != 0) {
				for (int j=0; j < i; j++) {
					System.out.print("*");
				} 
			}else {
				continue;
			}
			for (int j = i; j < 10; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		if (i > 9) {
			int x;
			for (x = 0; x < 10; x++) {
				if ((x % 2) != 0) {
					for (int y=8; y > x; y--) {
						System.out.print("*");
					} 
				}else {
					continue;
				}
				for (int j = i; j < 10; j++) {
					System.out.println(" ");
				}
				System.out.println();

		}
	}
	}
}
