package FIND_PAIRS_ALREADY_PRESENT;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class FindPair {

	public int solve(ArrayList<Integer> A) {
		int count = 0;
		HashSet<Integer>set=solveHashSet(A);
		for(int i=0;i<A.size();i++) {
			for(int j=i+1;j<A.size();j++) {
				if(set.contains(A.get(i)+A.get(j))) {
					count++;
				}
			}
		}
		return count;
	}

	private HashSet<Integer> solveHashSet(ArrayList<Integer> A) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int val:A) {
			set.add(val);
		}
		return set;
	}

}

class Solution {
	public static void main(String args[]) {
		FindPair fp = new FindPair();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 8));
		System.out.println(fp.solve(A));
	}
}