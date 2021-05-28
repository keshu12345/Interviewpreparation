package ReverseString;

import java.util.Scanner;

public class ReversetheString {

	public void solve(String A) {
		char[] charArray = new char[A.length() + 1];
		char[] arr = A.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			charArray[i] = arr[i];
		}

		int n = charArray.length;
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			l++;
			r--;
		}
		String s = new String(charArray);
		System.out.println("sb   " + s);
		int start = 0;
		int end = 0;
		int pos = 0;
		for (int i = 0; i < n; i++) {

			if (charArray[i] == ' ' || end == charArray.length - 1) {
				if (end != charArray.length - 1)
					end--;
				while (start <= end) {
					char tempVal = charArray[start];
					charArray[start] = charArray[end];
					charArray[end] = tempVal;
					start++;
					end--;

				}

				end = pos;
				start = pos++;

			}
			end++;
			pos = end;
		}
		String str = new String(charArray);
		System.out.println("ssss->" + str);

	}

	public static void main(String args[]) {
		ReversetheString rv = new ReversetheString();
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		rv.solve(A);

	}
}
