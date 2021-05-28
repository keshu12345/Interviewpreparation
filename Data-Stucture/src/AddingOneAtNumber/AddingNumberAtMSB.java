package AddingOneAtNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddingNumberAtMSB {

	public void solve(ArrayList<Integer> A) {
		System.out.println(A.size());
		int n = A.size() - 1;// 3
		int carry = 1;
	
		if(A.size()!=1) {
		for (int i = n; i >= 0; i--) {
			int val = (A.get(i) + carry) % 10;
			carry = (A.get(i) + carry) / 10;
			A.set(i, val);
		}
		
		}else {
			for (int i = n; i >= 0; i--) {
				int val = (A.get(i) + carry) % 10;
				carry = (A.get(i) + carry) / 10;
				A.set(i, val);
			}
		}
		if(carry==1) {
		A.add(0, carry);
		}
		System.out.println(A);

	}

}

class Main {

	public static void main(String args[]) {
		AddingNumberAtMSB msb = new AddingNumberAtMSB();

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(9,9,9,9));
		msb.solve(A);
	}
}
