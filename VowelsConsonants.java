package java_Technical_Interview;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str = "Hello";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();
        
        for(int i=0;i<str.length();i++) {
        	char ch = str.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		vowels++;
                continue;
        	}
        	
        	consonants++;
        	
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
	}

}
