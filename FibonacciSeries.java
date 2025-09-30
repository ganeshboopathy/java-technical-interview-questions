package java_Technical_Interview;

public class FibonacciSeries {

	public static void main(String[] args) {
     int n = 10;
     int s =0;
     int e =1;
     int tem;
     for(int i =0; i<n;i++) {
    	 tem=s;
    	 s=e;
    	 e=tem+e;
    	 System.out.println(tem);
     }
	}

}
