package KthGrammer;

import java.util.Scanner;

public class KthGrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(KthGrammerGenerate(N, K));

	}

	private static int KthGrammerGenerate(int n, int k) {
		// TODO Auto-generated method stub
		if (n == 1 && k == 1)
			return 0;
		int mid = (int) Math.pow(2, n - 2);
		if (k <= mid) {
			return KthGrammerGenerate(n - 1, k);
		} else {
		return  KthGrammerGenerate(n - 1, k - mid) == 0 ? 1 : 0;

		}

	}

}
