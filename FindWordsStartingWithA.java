package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindWordsStartingWithA {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.stream()
	     .filter(w -> w.startsWith("a"))
	     .forEach(System.out::println);
	}

}
