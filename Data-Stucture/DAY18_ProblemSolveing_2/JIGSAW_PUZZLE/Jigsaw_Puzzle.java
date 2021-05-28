package JIGSAW_PUZZLE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jigsaw_Puzzle {

	public int solve(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= A.size() - B; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = i; j < B + i; j++) {

				temp.add(A.get(j));
			}
			list.add(temp);
		}

		System.out.println("list" + list);
		int minDiff = Integer.MAX_VALUE;
		for (int k = 0; k < list.size(); k++) {
			ArrayList<Integer> sub = list.get(k);
			int min = sub.get(0);
			int max = sub.get(sub.size() - 1);
			int diff = Math.abs(max - min);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}

		return minDiff;
	}

}

class Solution {
	public static void main(String args[]) {
		Jigsaw_Puzzle jp = new Jigsaw_Puzzle();
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(10, 12, 10, 7, 5, 22));
		System.out.println(jp.solve(A, B));

	}
}
