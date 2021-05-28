package deleteMidlleElementofStack;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddleEleOfStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>stack=new Stack();
		stack.push(5);
		stack.add(4);
		stack.add(3);
		stack.add(2);
		stack.add(1);
		System.out.println(stack);
		//System.out.println(deleteMiddleEle(stack,stack.size()));
		System.out.println(reverseStack(stack));

	}

	private static Stack<Integer> reverseStack(Stack<Integer> stack) {
		if(stack.size()==0) {
			return stack;
		}
		
		int val=stack.pop();
		// TODO Auto-generated method stub
		reverseStack(stack);
		
			stack.push(val);
		
	
		return stack;
	}

	private static Stack<Integer> deleteMiddleEle(Stack<Integer> stack, int size) {
		// TODO Auto-generated method stub
		if(size==0) {
			return stack;
		}
		
		int k=size/2+1;
		solve(stack,k);
		return stack;
	}

	private static void solve(Stack<Integer> stack, int k) {
		// TODO Auto-generated method stub
		if(k==1) {
			stack.pop();
			return;
		}
		
		int val=stack.pop();
		solve(stack,k-1);
		stack.push(val);
		
	}

}
