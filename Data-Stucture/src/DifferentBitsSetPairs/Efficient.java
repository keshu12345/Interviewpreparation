package DifferentBitsSetPairs;

import java.util.Scanner;

public class Efficient {
	long res=0;

	public void solve(int[] arr) {
		
		for (int i = 0; i < 32; i++) {
			int on = 0;
			for (int value : arr) {
				if ((value & (1 << i)) != 0) {

					on++;

				}

			}
			
			int off=arr.length-on;
			res+=on*off*2;
			
			
			System.out.println("on Bit"+" Count=="+on+"Length="+arr.length+" off="+off+" res="+res);
		

		}
		System.out.println("Result=="+res);
		

	}

}

class DifferentSetBit {
	public static void main(String args[]) {
		Efficient eff = new Efficient();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		eff.solve(arr);

	}
}
