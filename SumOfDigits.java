package java_Technical_Interview;

public class SumOfDigits {
    public static void main(String[] args) {
      int num =1253; int sum =0;
      while(num!=0) {
    	  sum+=num%10;
    	  num/=10;
      }
      System.out.println("Sum of digits: " + sum);
    }
}
