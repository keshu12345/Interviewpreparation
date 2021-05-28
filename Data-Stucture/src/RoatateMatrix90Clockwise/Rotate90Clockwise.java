package RoatateMatrix90Clockwise;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate90Clockwise {

	public void solve(ArrayList<ArrayList<Integer>> A) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A.size(); i++) {

			ArrayList<Integer> zero = new ArrayList<Integer>();

			for (int j = 0; j < A.size(); j++) {
				zero.add(0);
			}

			res.add(zero);
		}
		int n = A.size();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res.get(i).set(j, A.get(j).get(i));
			}
		}

		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = res.get(i).size() - 1;
			while (left < right) {
				Integer temp = res.get(i).get(left);
				res.get(i).set(left, res.get(i).get(right));
				res.get(i).set(right, temp);
				left++;
				right--;
			}
		}
		System.out.println(res);

	}

	public void solve1(ArrayList<ArrayList<Integer>> A) {
		// TODO Auto-generated method stub

		int n=A.size()-1;
		for (int j = 0; j <=n; j++) {
            System.out.print("A.get(j)---"+A.get(j));
            System.out.println();
            }
		    ArrayList<ArrayList<Integer>> temp=(ArrayList<ArrayList<Integer>>) A.clone();

		for (int j = 0; j <=n; j++) {
			System.out.print("   temp--->"+temp);
			
			for (int i = n; i >= 0; i--) {
			Integer temp1=A.get(i-1).get(j);
				A.get(j).set(n-i,A.get(i).get(j));
				A=temp;
			}

			System.out.println();
			System.out.print(" " + temp);
			
		}
	}

	public void solve2(ArrayList<ArrayList<Integer>> A) {
		
	  int n=A.size();
	  for(int i=0;i<n;i++) {
		  for(int j=i+1;j<n;j++) {
			
				  Integer temp=A.get(i).get(j);
				  A.get(i).set(j, A.get(j).get(i));
				  A.get(j).set(i, temp);
			
		  }
		  
	  }
	  for (int i = 0; i < n; i++) {
			int left = 0;
			int right = A.get(i).size() - 1;
			while (left < right) {
				Integer temp = A.get(i).get(left);
				A.get(i).set(left, A.get(i).get(right));
				A.get(i).set(right, temp);
				left++;
				right--;
			}
		}
	  System.out.println(A);
	}

}

class Main {
	public static void main(String args[]) {
		Rotate90Clockwise roatate = new Rotate90Clockwise();

		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1, 2,3));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
		A.add(row1);
		A.add(row2);
		 A.add(row3);
	   // roatate.solve(A);
		//roatate.solve1(A);
		
		roatate.solve2(A);

	}
}