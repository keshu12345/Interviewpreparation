package ReverseStack;

import java.util.Stack;

public class ReverseStack {
	public static void main(String args[]) {
	
	Stack<Integer>stack=new Stack();
	stack.push(5);
	stack.add(4);
	stack.add(3);
	stack.add(2);
	stack.add(1);
	System.out.println(stack);
	System.out.println(reverseStack(stack));
}

	private static Stack<Integer> reverseStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		
		if(stack.size()==1) {
			return stack;
		}
		int val=stack.pop();
		reverseStack(stack);
		insert(stack,val);
		
		return stack;
	}

	private static void insert(Stack<Integer> stack, int val) {
		// TODO Auto-generated method stub
		if(stack.size()==0) {
			stack.push(val);
			return;
		}
		int tmp=stack.pop();
		insert(stack,val);
		stack.push(tmp);
		
	}
	}
