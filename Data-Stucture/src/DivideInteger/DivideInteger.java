package DivideInteger;

import java.util.Scanner;

public class DivideInteger {

	public void divideInteger(int a, int b) {
		 long num=0;
		   long dividend = (long)a; 
		   long divisor = (long)b; 
		   
		  // System.out.println("dividend= "+dividend+" divisor="+divisor);
		   long sign = (dividend < 0) ^(divisor < 0) ? -1 : 1; 
		   
		   dividend = Math.abs(dividend); 
		   divisor = Math.abs(divisor); 
		   
		   if(divisor==0) {
			   return;
		   }
		   if(dividend==0) {
			   num=0;
			   return;
		   }
		if(divisor==1) {
			num=sign*dividend;
			return;
		}
		
		num=(long) Math.floor(sign*Math.exp(Math.log(dividend) -  
                Math.log(divisor)));
		
		System.out.println(num);
	}

	
}


class Main{
	
	public static void main(String args[]) {
		DivideInteger di=new DivideInteger();
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		di.divideInteger(A,B);
	}
}