package TwoArrayCommonElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoArrayCommon {

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap();

		for (int i = 0; i < A.size(); i++) {
			int count = 1;
			if (map.containsKey(A.get(i))==true) {
				count += map.get(A.get(i));
				map.put(A.get(i), count);
			} else {
				map.put(A.get(i), count);
			}
		}
		for (int j = 0; j < B.size(); j++) {
			if (map.containsKey(B.get(j)) == true && (map.get(B.get(j)))!=0) {
				map.put(B.get(j), map.get(B.get(j)) - 1);
				arrList.add(B.get(j));

			}
		}
		return arrList;

	}

}

class main {
	public static void main(String args[]) {
		TwoArrayCommon tac = new TwoArrayCommon();
		ArrayList<Integer> A = new ArrayList(Arrays.asList(2, 1, 4, 10 ));
		ArrayList<Integer> B = new ArrayList(Arrays.asList(3, 6, 2, 10, 10));

		System.out.println(tac.solve(A, B));

	}
}