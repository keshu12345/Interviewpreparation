package FindNthPalindrome;

import java.util.Scanner;

public class FindNthPalindrome {

	public void solve(int n) {
		int length=1;
		int count=1;
		
		while(n>=count) {
			length++;
			int result=1<<(length-1)/2;
			count+=result;
		}
		
		System.out.println("Count=="+count+" length=="+length);
		count-=1<<((length-1)/2);
		int offset=n-count-1;
		int ans=1<<(length-1);
		ans|=offset<<(length/2);
		int reValue=ans>>(length/2);
		int rev=getReverse(reValue);
		ans|=rev;
		System.out.println("Ans=="+ans);
		
	}

	private int getReverse(int reValue) {
		int res=0;
		while(reValue!=0) {
			int lsb=reValue&1;
			res|=lsb;
			res<<=1;
			reValue>>=1;
		}
		res>>=1;
		return res;
	}

}

class Main{
	public static void main(String args[]) {
		FindNthPalindrome fnpa=new FindNthPalindrome();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fnpa.solve(n);
		
		
	}
	
}
