package MatrixMax1sRowinOrderN;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum1s {

	public void solve(ArrayList<ArrayList<Integer>> A) {
		// TODO Auto-generated method stub
		int n = A.size();
		int index_of_max_row = 0;
		int j = findIndexOffirstElement(A.get(0), 0, n - 1);
		if (j == -1)
			j = n - 1;
		for(int i=1;i<A.size();i++) {
			while(j>=0 &&(A.get(i).get(j)==1)) {
				j=j-1;
				
				index_of_max_row=i;
			}
		}
	  System.out.println("index_of_max_row=="+index_of_max_row);

	}

	private int findIndexOffirstElement(ArrayList<Integer> arrayList, int left, int right) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == 1) {
				index = i;
				break;
			}
		}
		return index;
	}

}

class Main {
	public static void main(String args[]) {
		Maximum1s m1s = new Maximum1s();
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList(Arrays.asList(0, 0, 0));
		ArrayList<Integer> row2 = new ArrayList(Arrays.asList(0, 1, 1));
		ArrayList<Integer> row3 = new ArrayList(Arrays.asList(1, 1, 1));
		A.add(row1);
		A.add(row2);
		A.add(row3);
		m1s.solve(A);
	}
}