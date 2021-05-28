package NEGATIVE_POSITIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class NegativeAndPositive {

	public ArrayList<Integer> solve(ArrayList<Integer> A) {

		for (int i = 0; i < A.size(); i++) {
			if (i % 2 != 0 && A.get(i) <=0) {

				for (int j = i + 1; j < A.size(); j++) {
					if (A.get(j) >=0) {
						int temp = A.get(i);
						A.set(i, A.get(j));
						A.set(j, temp);
						rigthRoation(A, i + 1, j);
						break;
					}
				}
			} else if (i % 2 == 0 && A.get(i) >= 0) {
				for (int j = i + 1; j < A.size(); j++) {
					if (A.get(j) < 0) {
						int temp = A.get(i);
						A.set(i, A.get(j));
						A.set(j, temp);

						rigthRoation(A, i + 1, j);
						break;
					}
				}

			}
		}

		return A;
	}

	public void rigthRoation(ArrayList<Integer> A, int i, int j) {
		
		int val = A.get(j);
		for (int k = j; k >i; k--) {
			A.set(k, A.get(k - 1));
		}
		A.set(i, val);

	}

}

class Solution {
	public static void main(String args[]) {
		NegativeAndPositive nap = new NegativeAndPositive();

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, -17, -100, -11,0));   ///4 -2 -3
		System.out.println(nap.solve(A));
		//nap.rigthRoation(A,0,0);
	}
}
