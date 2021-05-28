package ReverseBit;

import java.util.Scanner;

public class ReverseBit {
	public static void reverseBit(long n) {
		long []arr=new long[32];
		int i=31;
		while(i>=0) {
			
			arr[i]= (n&1);
			n=n>>1;
			i--;
		}
		long result=0;
		long p=1;
		for(int j=0;j<32;j++) {
			result=result+arr[j]*p;
			p=p*2;
		}
		
		System.out.println(result);
		
	}

}


class Main{
	
	//3221225472
	public static void main(String args[]) {
		ReverseBit rb=new ReverseBit();
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		rb.reverseBit(n);
	}
	
	
}