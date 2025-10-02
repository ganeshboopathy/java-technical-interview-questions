package java_Technical_Interview;

public class PalindromeString {

	public static void main(String[] args) {
		 String str = "madam";
	     String reversed = "";
	     
	     for(int i=str.length()-1; i>=0;i--) {
	    	 reversed+=str.charAt(i);
	     }
	     System.out.println(str.contentEquals(reversed)?str + " is a palindrome":str + " is not a palindrome");
	}

}
