
package PERMUTATION_A_B;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

	public int solve(String A, String B) {
		int count = 0;
		char temp[] = A.toCharArray();
		Arrays.sort(temp);
		String str = new String(temp);

		for (int i = 0; i < B.length(); i++) {
			for (int j = i + 1; j < B.length(); j++) {
				char[] arr = B.substring(i, j).toCharArray();
				Arrays.sort(arr);
				String s = new String(arr);

				if (s.equals(str)) {
					count++;
				}
			}
		}
		if (A.length() > B.length()) {
			return 0;
		}
		return count;
	}

	public int solve1(String A, String B) {
		int m = A.length();
		int n = B.length();
		if (m > n) {
			return 0;
		}
		int tempA[] = new int[26];
		int tempB[] = new int[26];

		Arrays.fill(tempA, 0);
		Arrays.fill(tempB, 0);

		for (int i = 0; i < m; i++) {
			tempA[A.charAt(i) - 'a']++;
		}
		for (int i = 0; i < m; i++) {
			tempB[B.charAt(i) - 'a']++;
		}
		int count = 0;
		count += isFrequency(tempA, tempB);
		for (int i = m; i < n; i++) {
			tempB[B.charAt(i - m) - 'a']--;
			tempB[B.charAt(i) - 'a']++;
			count += isFrequency(tempA, tempB);

		}

		return count;

	}

	private int isFrequency(int[] tempA, int[] tempB) {
		for (int i = 0; i < 26; i++) {
			if (tempA[i] != tempB[i]) {
				return 0;
			}
		}

		return 1;
	}

}

class Solution {
	public static void main(String args[]) {
		Permutation per = new Permutation();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		// System.out.println(per.solve(A,B));
		System.out.println(per.solve1(A, B));
	}
}
//baaaaabcbcaaacaaaacbbbcbacbcbbba
//ccbbcbbacaccabcabaabbbbbbbbbccbccbcbccaabaaacbacaabbacbcabaaaacacccccccabbbacacbacacacabbaabaabcbbbaccbccccbcbccacabbbabcabaaccabccbbaabbbcccabbbacb