package java_Technical_Interview;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean isEqual = Arrays.equals(arr1, arr2);
        
        System.out.println(isEqual?"Arrays are equal":"Arrays are not equal");
	}

}
