package Subsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
	ArrayList<Integer> arr = null;
	ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> subArray(ArrayList<Integer> list) {

		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temparr = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				temp = display(list, i, j);
			}
		}
		temp.add(temparr);
		return temp;
	}

	private ArrayList<ArrayList<Integer>> display(ArrayList<Integer> list, int i, int j) {
		// TODO Auto-generated method stub
		arr = new ArrayList<Integer>();

		while (i <= j) {
			arr.add(list.get(i));
			i++;
		}
		arrList.add(arr);
		return arrList;

	}

}

class Main {
	public static void main(String args[]) {
		Subsequence subSequence = new Subsequence();
		Integer[] arr = { 1, 2, 3, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		System.out.println(subSequence.subArray(list));
	}

}