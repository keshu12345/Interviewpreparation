package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class TwoSum {

	public void solve(final List<Integer> A, int B) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap();
		int index2=A.size();
		for (int i = 0; i < A.size(); i++) {
			int target = B - A.get(i);
			if (map.containsKey(target) == true) {
				index2=i;
				break;

			}
				map.put(A.get(i), i);	
		}
		if(index2<A.size()) {
		for(int i=0;i<A.size();i++) {
			if(A.get(index2)+A.get(i)==B) {
				arr.add(i+1);
				break;
			}
			
		}
		arr.add(index2+1);
		}
		System.out.println(arr);
		System.out.println(map);
	}

}

class Main {
	public static void main(String args[]) {
		TwoSum ts = new TwoSum();

		List<Integer> A = new ArrayList<Integer>(Arrays.asList(-10, -10, -10 ));
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		ts.solve(A, B);
	}
}