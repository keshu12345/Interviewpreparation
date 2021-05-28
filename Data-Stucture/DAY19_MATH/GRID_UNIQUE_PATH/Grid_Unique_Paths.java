package GRID_UNIQUE_PATH;

import java.util.Scanner;

public class Grid_Unique_Paths {

	public int uniquePaths(int A, int B) {
		
		return (fact(A+B-2))/(fact(A-1)*fact(B-1));
	}

	private int fact(int val) {
		int sum=1;
		for(int i=1;i<=val;i++ ) {
			sum=sum*i;
		}
		return sum;
	}
	
	 public int uniquePathsEfficeint(int A, int B) {
	     
	     
			return factEff(A-1,B-1);
		}

		private int factEff(int A,int B) {
		    if(A==0||B==0) return 1;
	     	int resMul=1;
	     	int num=A+B;
	     	int val=1;
	     	 int max=Math.max(A,B);
			for(int i=max+1;i<=num;i++ ) {
			 resMul*=i;
			 resMul/=val;
			 val++;
			 
			}
			return resMul;
		}

}
class Solution{
	public static void main(String args[]) {
		Grid_Unique_Paths gup=new Grid_Unique_Paths();
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(gup.uniquePaths(A,B));
		System.out.println(gup.uniquePathsEfficeint(A, B));
	}
}
