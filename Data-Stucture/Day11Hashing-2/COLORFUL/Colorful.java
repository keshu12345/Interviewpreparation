package COLORFUL;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Colorful {

	public int colorful(int A) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (A > 0) {
			list.add(A % 10);
			A = A / 10;
		}
		int val = solveSubsequence(list);
		return val;
	}

	private int solveSubsequence(ArrayList<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>();
		int n = 1 << list.size();
		for (int i = 0; i < n; i++) {
			int sum = 1;
			for (int j = i; j < list.size(); j++) {

				sum *= list.get(j);
				if (!set.contains(sum)) {
					set.add(sum);
				} else {
					return 0;
				}

			}
		}

		return 1;
	}

}

class Solution {
	public static void main(String args[]) {
		Colorful colorful = new Colorful();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println(colorful.colorful(A));

	}
}