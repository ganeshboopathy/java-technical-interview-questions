package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersIntoEvenAndOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		Map<Boolean, List<Integer>> partition = numbers.stream()
			    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
			System.out.println(partition);
	}

}
