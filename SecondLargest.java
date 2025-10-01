package java_Technical_Interview;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = {5, 8, 12, 7, 3};
		int largest = arr[0];
        int secondLargest = arr[0];
        
        for(int i =0; i<arr.length;i++) {
        	if(largest<arr[i]) {
        		secondLargest = largest;
        		largest= arr[i];
        		
        	}
        	else if(secondLargest<arr[i]&&largest>arr[i] ) {
        		secondLargest = arr[i];
        	}
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
	}

}
