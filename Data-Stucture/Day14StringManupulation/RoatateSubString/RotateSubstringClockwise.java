package RoatateSubString;

import java.util.Scanner;

public class RotateSubstringClockwise {

	public void solve(String A, int B) {
		String s = "";
		int b = B % A.length();
		s += A.substring(A.length() - b, A.length()) + A.substring(0, A.length() - b);
		System.out.println(s);

	}

}

class main {
	public static void main(String args[]) {
		RotateSubstringClockwise rsc = new RotateSubstringClockwise();
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		int B = sc.nextInt();
		rsc.solve(A, B);
	}
}