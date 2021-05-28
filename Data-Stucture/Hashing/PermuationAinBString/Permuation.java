package PermuationAinBString;

import java.util.Arrays;
import java.util.Scanner;
public class Permuation {

	public int solve(String A, String B) {

		int count = 0;
		for (int i = 0; i < B.length(); i++) {
			for (int j = i ; j <B.length(); j++) {
				char[] arr = B.substring(i, j+1).toCharArray();
				Arrays.sort(arr);
				String s = new String(arr);
				if (s.equals(A)) {
					count++;
				}
			}
		}
		if (A.length() > B.length()) {
			return 0;
		}
		return count;
	}

}
 class main {
	public static void main(String args[]) {
		Permuation pp = new Permuation();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(pp.solve(A, B));
	}
}
