package TwoMatrixTraversal;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoMatrixTraversal {

	public void solve(ArrayList<ArrayList<Integer>> matrix) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		int n=matrix.size();
		/*
		 * for(int i=0;i<n;i++) { ArrayList<Integer>temp=new ArrayList<Integer>();
		 * for(int j=0;j<n;j++) { temp.add(0); } res.add(temp); }
		 */
		
	int val=1;
	while(val<=((n)+(n)-1)) {
		ArrayList<Integer>temp=new ArrayList<Integer>();
		for(int i=0;i<matrix.size();i++) {
			for(int j=0;j<matrix.get(i).size();j++){
				if(i+j==val-1) {
					temp.add(matrix.get(i).get(j));
				}
			}
		}
		res.add(temp);
		val++;
	}
	
	System.out.println("Diagonal"+res);
	}

}


class main{
	public static void main(String args[]) {
		TwoMatrixTraversal tMT=new TwoMatrixTraversal();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>>matrix=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
		ArrayList<Integer>res=new ArrayList<Integer>();
		 for(int j=0;j<n;j++) {
			 res.add(0);
		 }
		matrix.add(res);
		}
		System.out.println("Mtrix"+matrix);
		int val=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix.get(i).set(j, val);
				val++;
			}
		}
		System.out.println("Matrix fill"+matrix);
		tMT.solve(matrix);
		
		for(int i=0;i<matrix.size();i++) {
			for(int j=0;j<matrix.get(i).size();j++) {
				System.out.println(matrix.get(i).get(j));
			}
		}
		
	}
}