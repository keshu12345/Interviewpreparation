package LETTER_PHONE;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class LetterPhone {

	public ArrayList<String>letterCombinations(String A) {
		HashMap<Character,String>map=insertIntoMap();
		ArrayList<String>list=new ArrayList<String>();
		String str="";
		solve(str,A,0,map,list);
		return list;
	}

	private void solve(String str,String A, int pos, HashMap<Character, String> map,ArrayList<String>list) {
		if(pos>=A.length()) {  //234
			list.add(str);
			return;
		}
	String s=map.get(A.charAt(pos));
	for(int i=0;i<s.length();i++)
		solve(str+s.charAt(i),A,pos+1,map,list);
		
	}

	private HashMap<Character, String> insertIntoMap() {
		HashMap<Character,String>map=new HashMap<Character, String>();
		map.put('0', "0");
		map.put('1', "1");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");		
		return map;
	}

}


class Solution{
	public static void main(String args[]) {
		LetterPhone lp=new LetterPhone();
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		System.out.println(lp.letterCombinations(A));
		
	}
}
