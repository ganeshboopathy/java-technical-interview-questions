package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindAllOddNumbersFromAList {

	public static void main(String[] args) {
     List<Integer> num = Arrays.asList(5,4,1,2,3,6,7,9,8,10);
     num.stream().filter(n->n%2!=0).forEach(System.out::println);
	}

}
