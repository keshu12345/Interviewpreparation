package ReverseStringHandleMultipleSpace;

import java.util.Scanner;

public class ReverseString {

	public void solve(String A) {
		
		String ans="";
		String curr="";
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)==' '&&A.charAt(i-1)!=' ') {
				ans =curr+" "+ans;
				curr="";
				
			}else if(A.charAt(i)!=' ') {
				curr=curr+A.charAt(i);
			}
		}
		if(curr.length()>0) {
			ans=curr+" "+ans;
		}
		System.out.println(ans.trim());
	}

}

class main{
	public static void main(String args[]) {
		ReverseString rs=new ReverseString();
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		
		rs.solve(A);
		
	}
}