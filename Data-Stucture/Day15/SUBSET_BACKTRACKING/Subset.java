package SUBSET_BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subset {
	 ArrayList<ArrayList<Integer>>temp =new  ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		
		 ArrayList<Integer>aux=new ArrayList();
		// Collections.reverse(A);
		 solve(A,0,aux);
		return temp;
	}

	private void solve(ArrayList<Integer> A, int index, ArrayList<Integer> aux) {
		
		 int n=A.size();
		 ArrayList<Integer>clone=(ArrayList<Integer>) aux.clone();
		 
		 if(index==n) {
			 temp.add(clone);
			 return ;
		 }
		 solve(A,index+1,aux); // 1 2 3 n==3
		 aux.add(A.get(index));
		 solve(A,index+1,aux);
		 aux.remove(aux.size()-1);
		
	}

}


class main{
	public static void main(String args[]) {
		Subset subset=new Subset();
		ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(subset.subsets(A));
	}
}