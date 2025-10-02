package java_Technical_Interview;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : arr) System.out.print(num + " ");
	}

}
