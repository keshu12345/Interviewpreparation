package PermuationWithSpace;

import java.util.ArrayList;
import java.util.Scanner;

public class PermuationWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		res+=s.charAt(0);
		s=s.substring(1);
		ArrayList<String>list=new ArrayList<String>();
		solve(s,res,0,list);
		System.out.println(list);

	}

	private static void solve(String s, String res, int idx, ArrayList<String> list) {
		if(idx==s.length()) {
			list.add(res);
			return;
		}
		solve(s,res+"-"+s.charAt(idx),idx+1,list);
		solve(s,res+s.charAt(idx),idx+1,list);
		
	}

}
