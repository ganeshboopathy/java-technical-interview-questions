package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindAverageOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
	double num =	numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
	System.out.println(num);
	}

}
