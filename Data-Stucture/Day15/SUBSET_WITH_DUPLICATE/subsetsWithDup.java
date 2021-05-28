package SUBSET_WITH_DUPLICATE;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class subsetsWithDup {
	LinkedHashSet<ArrayList<Integer>>set=new LinkedHashSet<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> subsetsWithDu(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>>temp=new ArrayList<ArrayList<Integer>>();
		Collections.sort(A);
		ArrayList<Integer>aux=new ArrayList<Integer>();
		solve(A,0,aux);
		for(ArrayList<Integer>val:set) {
			temp.add(val);
		}
	
		return temp;
	}

	private void solve(ArrayList<Integer> A, int index, ArrayList<Integer> list) {
		ArrayList<Integer> aux = (ArrayList<Integer>) list.clone();
		set.add(aux);

		for (int i = index; i < A.size(); i++) {
			aux.add(A.get(i));
			solve(A, i + 1, aux);
			aux.remove(aux.size() - 1);
		}
	}

}

class main {
	public static void main(String args[]) {
		subsetsWithDup swd = new subsetsWithDup();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2));
		System.out.println(swd.subsetsWithDu(A));
	}
}