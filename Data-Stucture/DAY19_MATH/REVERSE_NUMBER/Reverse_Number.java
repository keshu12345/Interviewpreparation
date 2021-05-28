package REVERSE_NUMBER;

import java.util.Scanner;

public class Reverse_Number {

	public int reverse(int A) {
		long reverse = 0;
		if (A < 0) {
			return 0;
		}
		int B=A;
		while (A > 0) {
			int rem = A % 10;
			

			if (reverse > Integer.MAX_VALUE) {
				return -1; // 2^9+9

			} else {
				reverse = reverse * 10 + rem;
			}
			A = A / 10;

			
		}
		if ((int) reverse == B) {
			return 1;
		}
		return 0;
	}

}

class Solution {
	public static void main(String args[]) {
		Reverse_Number rn = new Reverse_Number();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println(rn.reverse(A));
	}

}