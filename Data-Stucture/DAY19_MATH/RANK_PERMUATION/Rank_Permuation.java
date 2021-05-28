package RANK_PERMUATION;

import java.util.ArrayList;
import java.util.Scanner;

public class Rank_Permuation {

	public int findRank(String A) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < A.length() - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < A.length(); j++) {
				if (A.charAt(j) < A.charAt(i)) {

					count++;
				}
			}
			list.add(count);
		}
		list.add(0);
		int n = list.size();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = (sum + list.get(n - i - 1) * recursion(i)) % 1000003;
		}
		return (sum + 1) % 1000003;
	}

	private int recursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * recursion(n - 1) % 1000003;
	}

}

class Solution {
	public static void main(String args[]) {
		Rank_Permuation rp = new Rank_Permuation();

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(rp.findRank(A));
	}
}