package TwoSumUsingXOR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoSumUsingXor {

	public void solve(List<Integer> A, int B) {
		HashSet<Integer>set=new HashSet();
		int count=0;
		for(int i=0;i<A.size();i++) {
			if(set.contains(B^A.get(i))) {
				count++;
			}
			set.add(A.get(i));
		}
		
		System.out.println("Count--"+count);
	}

}


class main{
	public static void main(String args[]) {
		TwoSumUsingXor xor=new TwoSumUsingXor();
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5 ));
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		xor.solve(A, B);
	}
}