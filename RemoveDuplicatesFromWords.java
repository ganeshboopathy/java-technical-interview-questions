package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromWords {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry","apple");
		words.stream()
	     .distinct()
	     .forEach(System.out::println);

	}

}
