package Excel_Column_Number;

import java.util.HashMap;
import java.util.Scanner;

public class ExcelColumnNumber {

	public int titleToNumber(String A) {
		HashMap<Character, Integer> map = solveHashMap();
		int sum = 0;
		int mul = 1;
		for (int i = A.length() - 1; i >= 0; i--) {
			sum += map.get(A.charAt(i)) * mul;
			mul *= 26;

		}
		return sum;
	}

	private HashMap<Character, Integer> solveHashMap() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		map.put('E', 5);
		map.put('F', 6);
		map.put('G', 7);
		map.put('H', 8);
		map.put('I', 9);
		map.put('J', 10);
		map.put('K', 11);
		map.put('L', 12);
		map.put('M', 13);
		map.put('N', 14);
		map.put('O', 15);
		map.put('P', 16);
		map.put('Q', 17);
		map.put('R', 18);
		map.put('S', 19);
		map.put('T', 20);
		map.put('U', 21);
		map.put('V', 22);
		map.put('W', 23);
		map.put('X', 24);
		map.put('Y', 25);
		map.put('Z', 26);
		return map;
	}
}

class Solution {
	public static void main(String args[]) {
		ExcelColumnNumber ecn = new ExcelColumnNumber();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(ecn.titleToNumber(A));
	}
}