package java_Technical_Interview;

public class DigitsOnly {

	public static void main(String[] args) {
		String str = "12345bn";
        boolean isDigit = true;
     
        for(int i=0; i<str.length();i++) {
        	if(!Character.isDigit(str.charAt(i))) {
        		isDigit =false;
        		break;
        	}
        }
        System.out.println(isDigit?"contains only digits":" contains non-digit characters");
	}

}
