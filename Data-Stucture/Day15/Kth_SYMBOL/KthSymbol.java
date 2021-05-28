package Kth_SYMBOL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KthSymbol {
	
	public int solve(int A, int B) {
		 ArrayList<String>list=new ArrayList<String>();
	        list.add("0");
	        re(A,B,list);
	        String temp=list.get(0);
	        int val=Character.getNumericValue(temp.charAt(B-1));
	        return val;
	    }
	    
	    public void re(int A,int B,ArrayList<String>list){
	        if(A==1){
	            list.set(0,"0");
	            return;
	        }
	        
	       re(A-1,B,list);
	        String str="";
	        String s=list.get(0);
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='0'){
	                str=str+"01";
	            }else if(s.charAt(i)=='1'){
	                str=str+"10";
	            }
	        }
	        list.set(0,str);
	    }

}

class main {
	public static void main(String args[]) {
		KthSymbol ks = new KthSymbol();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(ks.solve(A, B));
	}

}