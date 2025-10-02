package java_Technical_Interview;

import java.util.HashMap;

public class CharFrequency {

	public static void main(String[] args) {
     String str = "hello";
     HashMap <Character,Integer> map = new HashMap<>();
     char[] arr = str.toCharArray();
     for(char ch : arr) {
    	 map.put(ch,map.getOrDefault(ch, 0)+1);
     }
     System.out.println(map);
	}

}
