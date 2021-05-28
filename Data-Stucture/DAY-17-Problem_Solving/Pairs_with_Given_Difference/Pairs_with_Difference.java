package Pairs_with_Given_Difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Pairs_with_Difference {

	public int Solve(ArrayList<Integer> A, int B) {
		HashSet<ArrayList<ArrayList<Integer>>> set = new HashSet<ArrayList<ArrayList<Integer>>>();

		Collections.sort(A);
		int n = A.size();
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < n && j < n) {
			if ((A.get(j) - A.get(i)) < B) {
				j++;
			} else if ((A.get(j) - A.get(i)) > B) {
				i++;
			} else if (((A.get(j) - A.get(i)) == B)) {
				ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(A.get(i));
				temp.add(A.get(j));
				list.add(temp);
				set.add(list);
				i++;
				j++;
			}
		}
		System.out.println(set);
		return set.size();
	}

}

class Solution {
	public static void main(String args[]) {
		Pairs_with_Difference pwd = new Pairs_with_Difference();
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2));
		System.out.println(pwd.Solve(A, B));
	}
}
