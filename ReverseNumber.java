package java_Technical_Interview;

public class ReverseNumber {

	public static void main(String[] args) {
      
		int num = 14150; int reverse =0; int leg = String.valueOf(num).length(); 
		
		while(num!=0) {
			int digit = num%10;
			reverse = reverse*10+digit;
			num/=10;
		}
		int legReverse = String.valueOf(reverse).length();
		System.out.println(legReverse==leg?reverse:"0"+reverse);
	}

}
