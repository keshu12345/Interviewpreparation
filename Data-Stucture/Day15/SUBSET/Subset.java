package SUBSET;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

		int n = A.size();
		int len = 1 << n;
		for (int i = 0; i < len; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j < A.size(); j++) {

				if ((i & (1 << j)) != 0) {
					arr.add(A.get(j));
				}
			}
			temp.add(arr);
		}
		return temp;
	}
}

class Main {
	public static void main(String args[]) {
		Subset subset = new Subset();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(subset.subsets(A));
	}

}
