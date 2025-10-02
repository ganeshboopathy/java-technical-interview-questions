package java_Technical_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheLongestWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		String max = words.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(max);

	}

}
