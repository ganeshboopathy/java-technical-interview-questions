package java_Technical_Interview;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
   int [] arr = {1,2,3,4,5};
   int L = arr.length;
   int k = 2;
   int[] rotated = new int[L];
   
   for(int i =0; i<L;i++) {
	   rotated[(i+k)%L] =  arr[i];  
   }
   
   System.out.println(Arrays.toString(rotated));
	}

}
