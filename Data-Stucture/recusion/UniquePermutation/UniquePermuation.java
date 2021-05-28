package UniquePermutation;

import java.util.ArrayList;
import java.util.Collections;

public class UniquePermuation {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);

		System.out.println(solve(arr, 0, true));

	}

	private static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> arr, int idx, boolean flag) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> list = new ArrayList();
		uniquePermuation(arr, list, idx, flag);
		return list;
	}

	private static void uniquePermuation(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> list, int idx,
			boolean flag) {
		if (arr.size() == idx) {
			list.add(new ArrayList(arr));
			return;
		}

		for (int i = idx; i < arr.size(); i++) {
			boolean check=shouldSwap(arr,idx,i);

			if (check) {	
				int temp = arr.get(idx);
				arr.set(idx, arr.get(i));
				arr.set(i, temp);
				Collections.sort(arr.subList(idx+1,arr.size()));
				uniquePermuation(arr, list, idx + 1, false);
				Collections.sort(arr.subList(idx+1,arr.size()));
				temp = arr.get(idx);
				arr.set(idx, arr.get(i));
				arr.set(i, temp);
			}
		}

	}

	private static boolean shouldSwap(ArrayList<Integer> arr, int idx, int curr) {
		// TODO Auto-generated method stub
		
		for(int i=idx;i<curr;i++) {
			if(arr.get(i)==arr.get(curr)) {
				return false;
			}
		}
		return true;
	}

}
