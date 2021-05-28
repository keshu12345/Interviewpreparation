package COMMON_ELEMENT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Common_Element {

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.sort(A);
		Collections.sort(B);
		int l1 = 0;
		int l2 = 0;
		while (l1 < A.size() && l2 < B.size()) {  //
			if (A.get(l2) > A.get(l1)) {
				l1++;
			} else if (A.get(l2) < A.get(l1)) {
				l2++;
			} else if (A.get(l2) == A.get(l1)) {
				list.add(A.get(l1));
				l1++;
				l2++;
			}
		}
		return list;
	}

}

class Solution {
	public static void main(String args[]) {
		Common_Element ce = new Common_Element();

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(2, 3, 1, 2));
		System.out.println(ce.solve(A, B));
	}
}
