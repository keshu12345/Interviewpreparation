package SUBSET_ORDER;

import java.util.Arrays;
import java.util.ArrayList;

public class SubsetOrder {
 ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		ArrayList<Integer> aux = new ArrayList();
		solve(A, 0, aux);
		return temp;
	}

	private void solve(ArrayList<Integer> A, int index, ArrayList<Integer> list) {

		ArrayList<Integer> aux = (ArrayList<Integer>) list.clone();
		temp.add(aux);

		for (int i = index; i < A.size(); i++) {
			aux.add(A.get(i));
			solve(A, i + 1, aux);
			aux.remove(aux.size() - 1);
		}

	}

}

class main {
	public static void main(String args[]) {
		SubsetOrder so = new SubsetOrder();
		ArrayList<Integer> A = new ArrayList(Arrays.asList(6));

		System.out.println(so.subsets(A));
	}

}
