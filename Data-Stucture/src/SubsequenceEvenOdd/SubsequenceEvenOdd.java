package SubsequenceEvenOdd;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceEvenOdd {

	public void solve(ArrayList<Integer> list) {
		ArrayList<Integer>arrList=new ArrayList<Integer>();
		if(list.get(0) ==list.get(list.size()-1)) {
			System.out.println(1);
		}
		arrList.add(list.get(0));
		int count=1;
		
		for(int i=1;i<list.size();i++) {
			if(((list.get(i-1))%2!=0)&&((list.get(i))%2==0)) {
				arrList.add(list.get(i));
				count++;
			}else if(list.get(i-1)%2==0&&list.get(i)%2!=0) {
				arrList.add(list.get(i));
				count++;
			}
		}
		
		System.out.println("Size=="+arrList.size());
		System.out.println("Size===="+count);
	}

}



class Main{
	public static void main(String args[]) {
		SubsequenceEvenOdd sed=new SubsequenceEvenOdd();
		 ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(15, 30, 39, 15));
		 sed.solve(list);
	}
}