package DifferentBitsSetPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifferentBitsSetPairs {

	public void solve(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int num=0;
		int count=0;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				num=list.get(i)^list.get(j);
				while(num>0) {
					count++;
					num=num&(num-1);
					
				}
			}
		}
		System.out.println("Count="+count);
		
	}

}


class Main{
	
	public static void main(String args[]) {
	DifferentBitsSetPairs dbsp=new DifferentBitsSetPairs();
	
	  Scanner sc=new Scanner(System.in);
	   
	   Integer[]arr= {1,3,7};
	   ArrayList<Integer>list=new ArrayList(Arrays.asList(arr));
	   dbsp.solve(list);
	}
}