package java_Technical_Interview;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] arr = {3, 7, 1, 9, 4};
        int max = arr[0], min = arr[0];
        for(int i=0; i<arr.length;i++) {
        	if(max<arr[i])max=arr[i];
        	if(min>arr[i])max=arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

	}

}
