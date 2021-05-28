package PermutationOfAinB;

import java.util.Scanner;

public class PermutationAandB {

	public void solve(String A, String B) {
		int l1=0;
		int l2=0;
		int count=0;
		
		while(l1<A.length()&&l2<B.length()) {
			int res=0;
			if(A.charAt(l1)==B.charAt(l2)) {
				res++;
				l1++;
				l2++;
				if(res==A.length()) {
					count++;
				}else {
					l1=0;
					l2++;
				}
			}
		}
		
		System.out.println("Count"+count);
	}

}

class Main{
	
	public static void main(String args[]) {
		PermutationAandB ab=new PermutationAandB();
		
		Scanner sc=new Scanner(System.in);
		 String A=sc.nextLine();
		 String B=sc.nextLine();
		 ab.solve(A,B);
	}
}