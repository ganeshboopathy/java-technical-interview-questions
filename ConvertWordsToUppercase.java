package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class ConvertWordsToUppercase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
