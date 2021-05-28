package CountNSetBit;

import java.util.Scanner;

public class SetBitCount1toN {

	public int solve(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		int x=Power(n);
		
		int first=x*(1<<(x-1));
		int second=n-(1<<x)+1;
		int rest=n-(1<<x);
		
		int result=first+second+solve(rest);
	return result;
		
	}

	private int Power(int n) {
		// TODO Auto-generated method stub
		int x=0;
		while(1<<x<=n) {
			x++;
		}
		return x-1;
	}

}

class Main{
	public static void main(String args[]) {
		SetBitCount1toN sb1n=new SetBitCount1toN();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(sb1n.solve(n));
		sb1n.solve(n);
	}
}