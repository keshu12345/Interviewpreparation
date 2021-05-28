package PermuationWithCaseChange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermuationWithCaseChange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<String>list=new ArrayList();
		solve(s,"",0,list);
		System.out.println(list);
		

	}

	private static void solve(String s, String res, int idx, List<String> list) {
		
		// TODO Auto-generated method stub
		if(idx==s.length()) {
			list.add(res);
			return;
		}
		
		int val=s.charAt(idx)-32;
		solve(s,res+(char)val,idx+1,list);
		solve(s,res+s.charAt(idx),idx+1,list);
		
	}

}
