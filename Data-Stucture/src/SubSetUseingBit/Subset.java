package SubSetUseingBit;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {

	public void subSet(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	int n=list.size();
	int pow=1<<n;
		ArrayList<Integer>arr;
	for(int i=1;i<=pow;i++) {
		arr=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			if((i&(1<<j))!=0) {
				arr.add(list.get(j));
			}
		}	
		
			System.out.print(arr);
			System.out.println();
		
		
	}

	}

}


class main{
	
	public static void main(String args[]) {
		Subset sub=new Subset();
		ArrayList<Integer>list=new ArrayList(Arrays.asList(1,2,3));
		sub.subSet(list);
	}
}