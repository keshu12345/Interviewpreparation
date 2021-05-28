package REARRANGE_ARRAY;

import java.util.Arrays;
import java.util.ArrayList;

public class Rearrange_Array {

	public void solve(ArrayList<Integer> a) {
		 int n=a.size();
		    for(int i=0;i<a.size();i++){
		        a.set(i,n*a.get(i));
		    }
		     for(int j=0;j<a.size();j++){
		    	
		       a.set(j,a.get(j)+(a.get(a.get(j)/n)/n));
		    			
		    }
	     for(int k=0;k<a.size();k++){
		        a.set(k,a.get(k)%n);
		    }
		   System.out.println(a) ;
		
	}

}

class Solution{
	public static void main(String args[]) {
		Rearrange_Array ra=new Rearrange_Array();
		ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList( 4, 0, 2, 1, 3));
		ra.solve(A);
		
	}
}
