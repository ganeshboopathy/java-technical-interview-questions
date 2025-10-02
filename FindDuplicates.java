package java_Technical_Interview;

import java.util.HashSet;

public class FindDuplicates {
	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 2, 4, 3};
	        HashSet<Integer> set = new HashSet<>();
	        System.out.print("Duplicates: ");
	        
	        for(int num: arr) {
	        	if(!set.add(num)) {
	        		System.out.print(num+" , ");
	        	}
	        }
	}
}
