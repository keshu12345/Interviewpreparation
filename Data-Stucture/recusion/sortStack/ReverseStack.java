package sortStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(4);
		stack.add(3);
		stack.add(2);
		stack.add(1);
//		int val = stack.pop();
//		System.out.println(val);
		//System.out.println((stack));

		System.out.println(sort(stack));
		
	}

	private static Stack<Integer> sort(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if (stack.size() == 1) {
			return stack;
		}
		int val = stack.pop();

		sort(stack);
		//insert(stack,val);
		ArrayList<Integer>list=null;
		if(stack.peek()>val) {
			list=new ArrayList<Integer>();
			
		while(stack.size()>=1&&stack.peek()>=val) {
			
			int temp=stack.pop();
			list.add(temp);
			
			
		}
		stack.push(val);
		
		}else {
		stack.push(val);
		}
		
		
		for(int i=list.size()-1;i>=0;i--) {
			stack.push(list.get(i));
			
		}
		return stack;
	}

	private static void insert(Stack<Integer> stack, int val) {
		// TODO Auto-generated method 
		if(stack.size()==0||stack.peek()<=val) {
			stack.add(val);
			return;
		}
		int temp=stack.pop();
		insert(stack,val);
		stack.add(temp);
		
		
	}

}
