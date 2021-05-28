package sortarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList(Arrays.asList(4,5,7,0,1,100,33,89,122,45,89));
		System.out.println(sort(list));

	}

	private static List<Integer> sort(List<Integer> list) {
		// TODO Auto-generated method stub
	if(list.size()==1) {
		return list;
	}
		
		int val=list.get(list.size()-1);
		     list.remove(list.size()-1);
		
		sort(list);
		insert(list,val);
		
		return list;
	}

	private static void insert(List<Integer> list, int val) {
		// TODO Auto-generated method stub
		if(list.size()==0||list.get(list.size()-1)<=val) {
			list.add(val);
			return;
		}
		int temp=list.get(list.size()-1);
	     list.remove(list.size()-1);
		insert(list,val);
		list.add(temp);
		
	}

}
