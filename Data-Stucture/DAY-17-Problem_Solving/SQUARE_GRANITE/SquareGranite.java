package SQUARE_GRANITE;

import java.util.Scanner;

public class SquareGranite {
	public int solve(int A, int B, int C) {

		long val = (long) (Math.ceil(((A + (C - 1)) / (C))));
		long val1 = (long) (Math.ceil(((B + (C - 1)) / (C))));
		return (int) (val * val1);

	}
}

class Solution {
	public static void main(String args[]) {
		SquareGranite sg = new SquareGranite();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println(sg.solve(A, B, C));

	}
}