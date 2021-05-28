package BOOK_LOVER;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
public class BookLover {

	public int solve(ArrayList<Integer> A) {
		int max=Integer.MIN_VALUE;
		
		int sum=A.get(0);
		for(int i=1;i<A.size();i++) {
			if(A.get(i)>=A.get(i-1)) {
				sum+=A.get(i);
			}else {
				sum=A.get(i);
				if(sum>max) {
					max=sum;
				}
			}
			
		}
		if(sum>max) {
			max=sum;
		}
		System.out.println("max"+max);
		
		int maxVal=Integer.MIN_VALUE;
		
		HashMap<Integer,Integer>map=solveHashMap(A);
		for(int val:A) {
			if(map.get(val)>maxVal) {
				maxVal=map.get(val);
			}
		}
		
		return A.get(A.size()-maxVal);
	}

	private HashMap<Integer, Integer> solveHashMap(ArrayList<Integer> A) {
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<A.size();i++) {
			map.put(A.get(i), A.size()-i);
		}
		return map;
	}

}

class Solution{
	public static void main(String args[]) {
		BookLover bl=new BookLover();
		ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(7,8,3,4,7));
		System.out.println(bl.solve(A));
	}
}
