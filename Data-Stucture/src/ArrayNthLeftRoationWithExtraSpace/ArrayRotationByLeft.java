package ArrayNthLeftRoationWithExtraSpace;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRotationByLeft {

	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int n = A.size();
		for (int k : B) {
			ArrayList<Integer> temp = new ArrayList<Integer>();

			for (int i = 0; i < n; i++)
				temp.add(A.get( (k + i) % n));
			list.add(temp);
		}
		return list;
	}

}

class Main {
	public static void main(String args[]) {
		ArrayRotationByLeft arr = new ArrayRotationByLeft();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(4, 3, 4, 5));
		System.out.println(arr.solve(A, B));
	}
}