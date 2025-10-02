package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumNumber {

	public static void main(String[] args) {
		List <Integer> num = Arrays.asList(9,5,7,6,3,8,1,2);
       int max =  num.stream().max(Integer::compare).get();
         System.out.println(max);
	}

}
