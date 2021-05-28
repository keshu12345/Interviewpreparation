package RoatateArrayByK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoatateArray {
	  public void solve(ArrayList<Integer> list, int num) {
		  int B=num%list.size();
		  if(B==0) {
			System.out.println(list);
		  }else {
	        int left1=0;
	        int right1=B;
	        while(left1<right1) {
				Integer temp=list.get(left1);
				list.set(left1, list.get(right1));
				list.set(right1, temp);
				left1++;
				right1--;
			}
	       
	       int left2=B+1;
	       int right2=list.size()-1;
	        while(left2<right2) {
				Integer temp=list.get(left2);
				list.set(left2, list.get(right2));
				list.set(right2, temp);
				left2++;
				right2--;
			}
			int left=0;
			int right=list.size()-1;
			  while(left<right) {
				Integer temp=list.get(left);
				list.set(left, list.get(right));
				list.set(right, temp);
				left++;
				right--;
			}
			System.out.println(list);
		  } 
	    }

}

class Main {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2,3,4));
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		

		RoatateArray ra = new RoatateArray();
		ra.solve(list, num);

	}
}
