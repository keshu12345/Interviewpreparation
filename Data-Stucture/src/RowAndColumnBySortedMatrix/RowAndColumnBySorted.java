package RowAndColumnBySortedMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class RowAndColumnBySorted {

	public int solve(ArrayList<ArrayList<Integer>> A,int B) {
		 int n=A.size();
		 int index_Of_Find_Element=0;
		 int j=0;
		 int i=0;
		for(int k=0;k<A.size();k++) {
			j=A.get(k).size()-1;
		 while(j>=0&&i<n) {
			 if(A.get(i).get(j)==B) {
				 index_Of_Find_Element= i*1009 +j;
				 return index_Of_Find_Element;
			 }else if(A.get(i).get(j)<B) {
				 i++;
			 }else {
				 j--;
			 }
		 }
		}
		return -1;
	}

}

class Main{
	public static void main(String args[]) {
		RowAndColumnBySorted rcbs=new RowAndColumnBySorted();
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList(Arrays.asList(1, 2, 3));
		ArrayList<Integer> row2 = new ArrayList(Arrays.asList(4, 5, 6));
		ArrayList<Integer> row3 = new ArrayList(Arrays.asList(7,8,9));
		A.add(row1);
		A.add(row2);
		A.add(row3);
		System.out.println(rcbs.solve(A,8));
	}
}
