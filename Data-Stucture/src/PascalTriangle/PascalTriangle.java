package PascalTriangle;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> temp;

	public void solve(int A) {

		for (int i = 0; i < A; i++) {

			temp = new ArrayList<Integer>();
			for (int k = 0; k <= i; k++) {
				int fact = fact(i);

				int factk = fact(k);
				int factnk = fact(i - k);
				int num = ((fact) / ((factk) * factnk));
				temp.add(num);
			}
			list.add(temp);
		}
		System.out.println(list);
	}

	private int fact(int A) {
		int num = 1;
		if (A == 0)
			return 1;
		for (int i = 1; i <= A; i++) {
			num = num * i;
		}
		return num;
	}

	public void solveEfficient(int A) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp;
		if (A != 0) {
			if (A == 1) {
				for (int i = 0; i < 1; i++) {
					temp = new ArrayList<Integer>();
					for (int k = 0; k <= i; k++) {
						temp.add(1);
					}

					list.add(temp);
				}
			}
			if (A == 2) {
				for (int i = 0; i < 2; i++) {
					temp = new ArrayList<Integer>();
					for (int k = 0; k <= i; k++) {
						temp.add(1);
					}

					list.add(temp);
				}
			}
			for (int i = 3; i <= A; i++) {
				temp = new ArrayList<Integer>();
				for (int j = 1; j <= i; j++) {
					if (j == 1) {
						temp.add(1);
					} else if (j == i) {
						temp.add(1);
					} else {
						temp.add(list.get(i - 2).get(j - 2) + list.get(i - 2).get(j - 1));
					}

				}
				list.add(temp);
			}
		}
		System.out.println("list  " + list);

	}

}

class Main {
	public static void main(String args[]) {
		PascalTriangle pt = new PascalTriangle();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		pt.solve(A);
		pt.solveEfficient(A);
	}
}