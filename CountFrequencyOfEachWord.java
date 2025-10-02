package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry","banana","banana","apple");
       Map<String,Long> freq = words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
       System.out.println(freq);
	}

}
