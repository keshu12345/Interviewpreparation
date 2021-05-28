package MaximumNumbers1MatrixRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maximum1sRow {

	public void bruteForce(ArrayList<ArrayList<Integer>> A) {
		int count = 0;
		int index=-1;
		int n = A.size();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			res.add(0);
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < A.get(i).size(); j++) {
				if (A.get(i).get(j) == 1) {
					count++;
				}

			}
			res.set(i, count);
			map.put(i, count);
		}
		int max = Integer.MIN_VALUE;
		for(int val:res) {
			if(val>max) {
				max=val;
			}
		}
		for(int i=0;i<res.size();i++) {
			if(res.get(i)==max) {
				index=i;
				System.out.println("Index"+index);
				break;
			}
		}
		/*
		 * for (Entry<Integer, Integer> val : map.entrySet()) {
		 * 
		 * if (val.getValue() > max) { max = val.getValue(); }
		 * 
		 * } for (Entry<Integer, Integer> val : map.entrySet()) {
		 * 
		 * if (val.getValue() == max) { System.out.println(val.getKey()); break; }
		 * 
		 * }
		 */
	}

	public int binarySearch(ArrayList<ArrayList<Integer>> A) {
		int count = 0;
	    int row = 0;
		int n = A.size();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			res.add(0);
		}
    
	
		
		for (int i = 0; i < n; i++) {
			count = calBinarySearch(A.get(i), 0, A.get(i).size() - 1);
			res.set(i, count);
			
		}
		int max = Integer.MIN_VALUE;
		
		for(int val:res) {
			if(val>max) {
				max=val;
			}
		}
		for(int i=0;i<res.size();i++) {
			if(res.get(i)==max) {
				row=i;
				break;
			}
		}
		return row;
		/*
		 * for (Entry<Integer, Integer> val : map.entrySet()) {
		 * 
		 * if (val.getValue() > max) { max = val.getValue(); }
		 * 
		 * } for (Entry<Integer, Integer> val : map.entrySet()) {
		 * 
		 * if (val.getValue() == max) { System.out.println("HashMap ---" +
		 * val.getKey()); row=val.getKey(); break; } }
		 */
	}

	private int calBinarySearch(ArrayList<Integer> arrayList, int left, int right) {
		// TODO Auto-generated method stub
		int n = arrayList.size();
		while (left <= right) {
			int mid = left + right / 2;

			if ((mid == 0 || (arrayList.get(mid - 1) == 0) && arrayList.get(mid) == 1)) {
				return n - mid;

			} else if (arrayList.get(mid) == 0) {
				
				left = mid + 1;

			} else {
				
				right = mid - 1;
			}
		}
		return -1;
	}

}

class Main {
	public static void main(String args[]) {
		Maximum1sRow mn1r = new Maximum1sRow();
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList(Arrays.asList(0, 1, 1));
		ArrayList<Integer> row2 = new ArrayList(Arrays.asList(0, 1, 1));
		ArrayList<Integer> row3 = new ArrayList(Arrays.asList(1, 1, 1));
		A.add(row1);
		A.add(row2);
		A.add(row3);
		mn1r.bruteForce(A);
		System.out.println(mn1r.binarySearch(A));

	}
}