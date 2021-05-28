package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSpiral2 {

	public void solve(int A) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A; i++) {

			ArrayList<Integer> zero = new ArrayList<Integer>();

			for (int j = 0; j < A; j++) {
				zero.add(0);
			}

			matrix.add(zero);
		}
		int Top = 0;
		int Bottom = A - 1;
		int left = 0;
		int right = A - 1;
		int val = 1;
		while (left <= right && Top <= Bottom) {

			for (int k = left; k <= right; k++) {
				matrix.get(Top).set(k, val);
				val++;
			}
			Top++;
			for (int k = Top; k <= Bottom; k++) {
				matrix.get(k).set(right, val);
				val++;
			}

			right--;
			for (int k = right; k >= left; k--) {
				matrix.get(Bottom).set(k, val);
				val++;
			}
			Bottom--;
			for (int k = Bottom; k >= Top; k--) {
				matrix.get(k).set(left, val);
				val++;
			}
			left++;
		}

		System.out.println("SpiralMatrix" + matrix);

	}

}

class Main {
	public static void main(String args[]) {
		MatrixSpiral2 spiral = new MatrixSpiral2();

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(4);
		System.out.println("size" + matrix.size());
		System.out.println(matrix.toString());// print empty matrix
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(8, 9, 4));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7, 6, 5));
		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		// System.out.println(matrix.toString());

		spiral.solve(5);

	}

}
