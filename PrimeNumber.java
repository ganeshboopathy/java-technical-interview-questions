package java_Technical_Interview;

public class PrimeNumber {

	public static void main(String[] args) {
     int num=1;
     boolean bool = true;
     
     for(int i =2; i<17;i++) {
    	 if(num%i==0) {
    		 bool =false;
    	 }
     }
     System.out.println(bool?(num>1?"PrimeNumber":"0 and 1 not PrimeNumber"):"not PrimeNumber");
	}

}
