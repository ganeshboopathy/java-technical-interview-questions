package java_Technical_Interview;

import java.util.HashSet;

public class ArrayIntersection {

	public static void main(String[] args) {
		 int[] arr1 = {1, 2, 3};
	     int[] arr2 = {2, 3, 4};
	     
	     HashSet<Integer> set = new HashSet<>();
	     HashSet<Integer> Intersection = new HashSet<>();
	     
	     for(int num : arr1) set.add(num);
	     for(int num:arr2) {
	    	 if(set.contains(num)) {
	    		 Intersection.add(num);
	    	 }
	     }
	     System.out.println(Intersection);
	}

}
