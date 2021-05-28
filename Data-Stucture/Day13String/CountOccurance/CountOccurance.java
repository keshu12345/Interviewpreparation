package CountOccurance;

import java.util.Scanner;

public class CountOccurance {

	public int solve(String A) {
	int count=0;
	String temp="bob";
	if(A.length()<temp.length()) return 0;
	for(int i=0;i<A.length();i++) {
		for(int j=i;j<A.length();j++) {
			String str=A.substring(i,j+1);
			if(str.equals("bob")) {
				count++;
			}
		}
	}
		return count;
	}

}

class Main{
	public static void main(String args[]) {
		CountOccurance co=new CountOccurance();
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		System.out.println(co.solve(A));
	}
}