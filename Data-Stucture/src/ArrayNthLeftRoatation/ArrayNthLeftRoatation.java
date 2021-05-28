package ArrayNthLeftRoatation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNthLeftRoatation {

	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> templist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = null; // [[3, 4, 5, 1, 2, 1, 2, 3, 4, 5], [3, 4, 5, 1, 2, 1, 2, 3, 4, 5]]
		int b = 0;
		ArrayList<Integer> temparr = (ArrayList<Integer>) A.clone();
		for (int j = 0; j < B.size(); j++) {

			list = new ArrayList<Integer>();

			b = ((B.get(j)) % A.size());

			if (b == 0) {

				list.addAll(A);

			} else {
				int l = 0;
				int r = b - 1;
				reverse(A, l, r);
				int l1 = b;
				int r1 = A.size() - 1;
				reverse(A, l1, r1);
				int l2 = 0;
				int r2 = A.size() - 1;
				reverse(A, l2, r2);
				list.addAll(A);
			}

			templist.add(list);
			A = temparr;
		}

		return templist;

	}

	private void reverse(ArrayList<Integer> A, int l, int r) {
		while (l <= r) {
			Integer temp = A.get(l);
			A.set(l, A.get(r));
			A.set(r, temp);
			l++;
			r--;
		}

	}

}

class Main {
	public static void main(String args[]) {
		ArrayNthLeftRoatation n = new ArrayNthLeftRoatation();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		// [3 4 5 1 2 ] [4 5 1 2 3 ] [[3, 4, 5, 1, 2], [2, 3, 4, 5, 1]]
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(2, 3));
		System.out.println(n.solve(A, B));

	}

}