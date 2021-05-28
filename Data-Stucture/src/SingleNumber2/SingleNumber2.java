package SingleNumber2;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber2 {

	public void singleNumber2(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int []arr=new int[32];
		for(int value:list) {
			int i=0;
			while(value>0) {
				arr[i]+=value&1;
				value=value/2;
				i++;
				
			}
		}
		int result=0;
		int p=1;
		for(int i=0;i<32;i++) {
			arr[i]=arr[i]%5;
			result=result+arr[i]*p;
			p=2*p;
		}
		
		System.out.println("Result=="+result);
		
	}

}

 class Main{
	 
	 public static void main(String args[]) {
		 SingleNumber2 sl2=new SingleNumber2();
		Integer[]arr= {1,2,3,4,1,2,3,4,1,2,3,4,5,5,5,7,1,1,2,2,3,3,4,4,5,5};
		
		ArrayList<Integer>list=new ArrayList(Arrays.asList(arr));
		
		sl2.singleNumber2(list);
	 }
	
}
