package MultiplicationPreviousAndnext;

import java.util.ArrayList;
import java.util.Arrays;

public class PreviousAndNext {

	public void solve(ArrayList<Integer> A) {
		   ArrayList<Integer>list=new ArrayList<Integer>();
		    int n=A.size();
		    if(n==1){
		        list.add(0);
		    }else {
		    for(int i=0;i<n;i++){
		        
		        if(i==0){
		            list.add(A.get(i)*A.get(i+1));
		        }else if(i==n-1){
		              list.add(A.get(i-1)*A.get(i));
		        }else if(i<n-1){
		              list.add(A.get(i-1)*A.get(i+1));
		        }
		        
		    }
		    }
		    System.out.println(list);
		
	}

}

class Main {

	public static void main(String args[]) {
		PreviousAndNext pan = new PreviousAndNext();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0));
		pan.solve(A);
        
	}
}