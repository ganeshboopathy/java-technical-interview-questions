package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindAllEvenNumbersFromAList {

	public static void main(String[] args) {
      List<Integer> num = Arrays.asList(4,8,5,6,2,3,7,4,9,1,0,10);
      num.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
