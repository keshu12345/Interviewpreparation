package PAIRS_DIV_BY_K;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Pairs_Div_K {

	public int solve(ArrayList<Integer> A, int B) {
		  HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
	       
//	        for(int val:A){
//	             int count=0;
//	            int rem=val%B;
//	            if(map.containsKey(rem)){
//	               
//	              count=map.get(rem)+1;
//	              map.put(rem,count);
//	                
//	            }else{
//	                count++;
//	                map.put(rem,count);
//	            }
//	        }
	        int res=0;
	        for(int val:A){
	            int diff=B-val%B;
	               int count=0;
	            int rem=val%B;
	            if(map.containsKey(diff)){
	            	if(rem==0) {
	            		   res++;
	     	              count=map.get(B)+1;
	     	              map.put(B,count);
	            	}else {
	            		   res++;
	     	              count=map.get(rem)+1; 
	     	              map.put(rem,count);
	            	}
	            
	                
	            }else {
	            	if(rem==0) {
	            		count++;
	            		map.put(B, count);
	            	}else {
	                count++;
	                map.put(rem,count);
	            }
	        }
	        }
	        System.out.println(map);
		return res;
	}

}

class Solution {
	public static void main(String args[]) {
		Pairs_Div_K pdk = new Pairs_Div_K();

		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,  3, 7, 9));//1 3 3 1 
		System.out.println(pdk.solve(A,B));
	}
}