package SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SingleNumber {

	public void singleNumber(ArrayList<Integer>list) {
		// TODO Auto-generated method stub
		Collections.sort(list);
		int count=0;
		System.out.println(list);
		for(int i=0;i<list.size()-2;i=i+3) {
		
			if(list.get(i)!=list.get(i+2)) {
				System.out.println(list.get(i));
				break;
				
			}
			count=count+3;
		}
		System.out.println(count);
		System.out.println("size"+list.size());
		if(count+1==list.size()) {
			System.out.println(list.get(count));
		}
		
	}

}

class Main{
	public static void main(String args[]) {
		SingleNumber sn=new SingleNumber();
		Integer[]array= {1,1,1,2,2,2,3};
		
		ArrayList<Integer>list=new ArrayList<>();
		list.addAll(Arrays.asList(array));
		
		sn.singleNumber(list);
	}
}
