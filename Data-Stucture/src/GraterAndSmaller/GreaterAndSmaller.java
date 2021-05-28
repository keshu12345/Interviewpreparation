

// find total numbers is strictly smaller and strictly greater

package GraterAndSmaller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreaterAndSmaller {

	public void greaterAndSmallerCount(ArrayList<Integer>list) {
		// TODO Auto-generated method stub
		
		if(list.size()==1||list.get(0)==list.get(list.size()-1)) {
			System.out.println(0);
			return ;
		}
		int count=0;
		//Collections.sort(list);
		 System.out.println(list);
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 for(int value:list) {
			 if(value>max) {
				 max=value;
			 }
			 if(value<min) {
				 min=value;
			 }
		 }
		 
		 System.out.println("Min "+min+"   max"+max);
		
		 int countMax=0;
		 int countMin=0;
		 for(int countValue:list) {
			 if(countValue==max) {
				 count++;
			 }
			 if(countValue==min) {
				 count++;
			 }
		 }
		int result= list.size()-count;
//		 for(int i=0;i<list.size()-1;i++) {
//			 if(list.get(i)!=list.get(i+1)) {
//				 count++;
//			 }
//		 }
		
System.out.println("Result = "+result);
		return ;
		
	}

}


class Main {
	public static void main(String args[]) {
		GreaterAndSmaller gas=new GreaterAndSmaller();
		List<Integer>list=Arrays.asList( 913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930, 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110);
	List<Integer> otherList = new ArrayList<Integer>();
		Integer[]array= { 913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930, 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110};
		//Integer[]array= {1,1,1,1};
		
		ArrayList<Integer> listarray = new ArrayList<>(Arrays.asList(array));
		
		  //Collections.addAll(otherList, list);
	gas.greaterAndSmallerCount(listarray);
		
	}
}
