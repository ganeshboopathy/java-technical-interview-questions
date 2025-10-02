package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindDistinctNumbersFromAList {

	public static void main(String[] args) {
      List <Integer> num = Arrays.asList(1,2,3,4,5,2,1,6,3,7,8,9,4,9) ;
      num.stream().distinct().forEach(System.out::println);
	}

}
