package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfEachNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		numbers.stream().map(n->n*n).forEach(System.out::println);
	}

}
