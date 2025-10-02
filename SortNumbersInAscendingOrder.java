package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class SortNumbersInAscendingOrder {

	public static void main(String[] args) {
List <Integer> num = Arrays.asList(9,5,7,6,3,8,1,2);
 num.stream().sorted().forEach(System.out::println);
	}

}
