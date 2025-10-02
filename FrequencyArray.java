package java_Technical_Interview;

import java.util.HashMap;

public class FrequencyArray {

	public static void main(String[] args) {
		 int[] arr = {2, 3, 2, 4, 3, 2};
	        HashMap<Integer, Integer> freqMap = new HashMap<>();
	        
	        for(int num : arr) {
	        	freqMap.put(num, freqMap.getOrDefault(num,0)+1);
	        }
	        System.out.print(freqMap);
	}

}
