package AmazingSubarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AmazingSubArray {

	public void solve(String A) {
		int l = 0;
		int r = A.length();
		HashMap<Character, ArrayList<Integer>> map = new HashMap();
		for (int i = 0; i < A.length(); i++) {
			if (map.containsKey(A.charAt(i))) {
				if (check(A.charAt(i))) {
					ArrayList<Integer>list=new ArrayList<Integer>();
					ArrayList<Integer> index=map.get(A.charAt(i));
					list.addAll(index);
					list.add(i);
					map.put(A.charAt(i), list);
				}
			} else {
				if (check(A.charAt(i))) {
					ArrayList<Integer>list=new ArrayList<Integer>();
					list.add(i);
					map.put(A.charAt(i), list);
				}
			}
		}
		int count=0;
		for (int j = 0; j < A.length(); j++) {
         if(map.containsKey(A.charAt(j))) {
        	 ArrayList<Integer> index=map.get(A.charAt(j));
        	 for(int val:index) {
        	 count+=A.length()-val;
        	 index.remove(0);
        	 break;
        	 }
         }
		}
		System.out.println("Count-->"+count%10003);
	}

	private boolean check(char val) {
		HashSet<Character> set = new HashSet();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		if (set.contains(val)) {
			return true;
		}

		return false;
	}

}

class main {
	public static void main(String args[]) {
		AmazingSubArray asa = new AmazingSubArray();
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();

		asa.solve(A);

	}
}