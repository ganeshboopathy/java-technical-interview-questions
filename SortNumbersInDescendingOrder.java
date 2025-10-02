package java_Technical_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersInDescendingOrder {

	public static void main(String[] args) {
		List <Integer> num = Arrays.asList(9,5,7,6,3,8,1,2);
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
