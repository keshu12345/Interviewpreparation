package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDuplicate {

	public void sigleUniqueNumber(ArrayList<Integer> list) {
		// @Keshav Rajput
		
		HashMap<Integer,Integer>map=new HashMap();
	 for(int value:list) {
		 if(!map.containsKey(value)) {
			 map.put(value, 1);
		 }else {
			 map.put(value, map.get(value)+1);
		 }
	 }
	 
	for(Entry<Integer, Integer> m :map.entrySet()) {
		if(m.getValue()!=3) {
			System.out.println(m.getKey());
		}
	}
		
	}

}

class Main{
	public static void main(String args[]) {
		HashMapDuplicate hmd=new HashMapDuplicate();
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		
//	int[]arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		Integer[]arr= {1,1,1,2,3,2,2};
		ArrayList<Integer>list=new ArrayList(Arrays.asList(arr));
		
		hmd.sigleUniqueNumber(list);
		
		
	}
	
}
