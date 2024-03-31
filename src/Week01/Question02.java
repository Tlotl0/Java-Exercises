package Week01;

import java.util.List;
import java.util.stream.Collectors;

/*program to insert 5 floating point numbers in a List & finding the sum of the
  numbers in List.*/
public class Question02 {

	public static void main(String... args) {
		List<Float> list = List.of(5.6657f, 5.4678f, 3.768f, 6.678f);
		var sum = list.stream().collect(Collectors.summingDouble(i -> i));
		System.out.println("The list has the following numbers " + list);
		System.out.println("Their sum is " + sum);
	}

}
