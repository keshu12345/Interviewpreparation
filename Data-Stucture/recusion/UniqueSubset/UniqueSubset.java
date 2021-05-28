package UniqueSubset;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String>list=new ArrayList<String>();
		uniqueSubset(s,"",0,true,list);
		System.out.println(list);

	}

	private static void uniqueSubset(String s, String res, int idx, boolean b,ArrayList<String>list) {
		// TODO Auto-generated method stub
		
		if(idx==s.length()) {
			list.add(res);
			return ;
			
			
		}
		if(b==false&&s.charAt(idx)==s.charAt(idx-1)) {
			uniqueSubset(s,res,idx+1,false,list);
		}else {
		
		uniqueSubset(s,res+s.charAt(idx),idx+1,true,list);
		uniqueSubset(s,res,idx+1,false,list);
		}
		
	}

}
