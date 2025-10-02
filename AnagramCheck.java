package java_Technical_Interview;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		 String str1 = "listen";
	     String str2 = "silent";
	     str1 = str1.toLowerCase();
	     str2 = str2.toLowerCase();
	     
	  char[] str1Arr = str1.toCharArray();
	  char[] str2Arr = str2.toCharArray();
	  Arrays.sort(str1Arr);
	  Arrays.sort(str2Arr);
	  
	  System.out.println(str1Arr.length!=str2Arr.length?"Strings are not anagrams":(Arrays.equals(str1Arr, str2Arr)?"Strings are  anagrams":"Strings are not anagrams"));
	  
	}

}
