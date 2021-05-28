package AddBinaryString;

import java.util.Scanner;

public class AddBinaryStrings {

	public String addStrings(String A,String B) {
		// TODO Auto-generated method stub
		    int l1=A.length()-1;
	        int l2=B.length()-1;
	        int carry=0;
	        String s ="";
	        int rem=0;
	        int num1 = 0;
	        int num2 = 0;
	        while(l1>=0||l2>=0){
	        	if(l1>=0) {
	        		  num1=A.charAt(l1)-'0';
	        	}
	        	if(l2>=0) {
	        		  num2=B.charAt(l2)-'0';
	        	}
	           
	           
	            int add=num1+num2+carry;
	            carry=add/2;
	            rem=add%2;
	           
	           s=String.valueOf(rem)+s;
	           num1=0;
	           num2=0;
	           
	            l1--;
	            l2--;
	            
	            
	        }
	        if(carry==1) {
	        	 s=String.valueOf(carry)+s;
	        }
	       
	        return s;
	}

}

class Main{
	public static void main(String args[]) {
		AddBinaryStrings addStrings=new AddBinaryStrings();
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		String B=sc.nextLine();
		System.out.println(addStrings.addStrings(A,B));
	}
}
