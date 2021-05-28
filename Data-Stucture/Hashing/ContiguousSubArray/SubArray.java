package ContiguousSubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class SubArray {

	public void solve(ArrayList<Integer> A) {
		HashMap<Integer,Integer>map=new HashMap();
		int res=0;
		int sum=0;
		map.put(0, -1);
		for(int i=0;i<A.size();i++) {
			if(A.get(i)==0) {
				sum-=1;
			}else if(A.get(i)==1){
				sum+=1;
			}
			
			if(map.containsKey(sum)) {
				int index=map.get(sum);
				int len=i-index;
				if(len>res) {
					res=len;
				}
			}else {
				map.put(sum, i);
			}
		}
		
		System.out.println(res);
	}

}


class Main{
	public static void main(String args[]) {
		SubArray sub=new SubArray();
		
		ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1 ));
		
		sub.solve(A);
	}
}