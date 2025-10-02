package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Map<Integer, List<String>> grouped = words.stream()
			    .collect(Collectors.groupingBy(String::length));
			System.out.println(grouped);
	}

}
