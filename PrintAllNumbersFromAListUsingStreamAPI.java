package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class PrintAllNumbersFromAListUsingStreamAPI {

	public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(5,2,8,1,3);
      numbers.stream().forEach(System.out::println);
	}

}
