package java_Technical_Interview;

public class Armstrong {

	public static void main(String[] args) {
    int num=153;
    int org = num;
    int tem = 0 ;
    int sum = 0;
    String leg =""+num;
    
    while(num!=0) {
    	tem = num %10;
    	int mul=1;
    	for(int i=0;i<leg.length();i++) {
    		mul*=tem;
    	}
    	sum+=mul;
    	num/=10;
    }
    System.out.println(sum==org?"Armstrong":"Non Armstrong");    
	}

}
