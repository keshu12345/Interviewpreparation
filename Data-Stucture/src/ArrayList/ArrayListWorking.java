package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWorking {

	public void solve(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		list.add(6);
		System.out.println("list  =="+list+ " size"+list.size());
		//list.clear();
		list.clone();
		list.remove(list);
		System.out.println("clear == "+list+" size"+list.size());
		System.out.println(list.get(4));
		
	}

}

class main{
	public static void main(String args[]) {
		ArrayListWorking alw=new ArrayListWorking();
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		alw.solve(list);
				
	}
}
