package PERFECT_CARD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.HashMap;

public class PerfectCard {

	public String solve(ArrayList<Integer> A) {
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		   int count=0;
			for(int val:A) {
			    if(map.containsKey(val)){
			        count++;
			        count+=map.get(val);
			      map.put(val,count);
			    }else{
			        count++;
			        map.put(val,count);
			        
			    }
			}
			int sumCount=0;
			for(Entry<Integer, Integer> val:map.entrySet()){
			   sumCount+=map.get(val);
			}
			if(map.size()%2==0){
			    if(sumCount%2!=0){
				return "LOSE";
			    }else{
			        return "WIN";
			    }
			}
			return "LOSE";
}

}

class Solution{
	public static void main(String args[]) {
		PerfectCard pc=new PerfectCard();
		ArrayList<Integer>A=new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3));
		
		System.out.println(pc.solve(A));
	}
}
