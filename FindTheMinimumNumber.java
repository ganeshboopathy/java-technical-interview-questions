package java_Technical_Interview;

import java.util.Arrays;
import java.util.List;

public class FindTheMinimumNumber {

	public static void main(String[] args) {
    List <Integer> num = Arrays.asList(4,5,6,1,2,3);
      int min = num.stream().min(Integer::compare).get();
      
      System.out.println(min);
	}

}
