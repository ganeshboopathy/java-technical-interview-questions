package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreaterThan5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3,9,12,8,7,3);
		Long num = numbers.stream().filter(n->n>5).count();
		System.out.print(num);
	}

}
