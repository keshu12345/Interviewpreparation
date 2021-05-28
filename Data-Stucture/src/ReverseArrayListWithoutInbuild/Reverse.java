package ReverseArrayListWithoutInbuild;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {

	public void revesreInbuilds(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		 Collections.reverse(list); 
		 System.out.println("List is revese using Inbuild Method-->"+list);
		 
	
	}

	public void reverseUsingExtraSpace(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
	ArrayList<Integer>arrList=new ArrayList<Integer>();
		
		for(int i=list.size()-1;i>=0;i--) {
			arrList.add(list.get(i));
		}
		
		System.out.println("List is reverse using extra space--->"+arrList);
	}

	public void reverseWithoutExtraSpace(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int left=1;
		int right=list.size()-2;
		while(left<=right) {
			Integer temp=list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}
		System.out.println("List Reverse without Extra Space-->"+list);
		
	}



}


class Main{
	public static void main(String args[]) {
		Reverse rr=new Reverse();
		
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		list.set(4, 6);
		rr.revesreInbuilds(list);
		rr.reverseUsingExtraSpace(list);
		rr.reverseWithoutExtraSpace(list);
		
	}
}
