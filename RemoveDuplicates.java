package java_Technical_Interview;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "programming";
		String str1="";
		HashSet<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			
			if(!set.contains(ch)) {
				str1+=ch;
				set.add(ch);
				
			}
		}
		System.out.println(str1);
	}

}
