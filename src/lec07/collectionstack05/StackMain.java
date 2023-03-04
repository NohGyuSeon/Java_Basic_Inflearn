package lec07.collectionstack05;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Integer push = stack.push(1);
		System.out.println("push return 값 : " + push);
		Integer push1 = stack.push(2);
		System.out.println("push1 return 값 : " + push1);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		Integer pop = stack.pop();
		System.out.println("pop 값 : " + pop);
		System.out.println(stack);
		
		Integer peek = stack.peek();
		System.out.println("stack : " + stack);
		System.out.println("peek : " + peek);
		
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			Integer getPeek = stack.peek();
			System.out.println("getPeek : " + getPeek);
		}
		System.out.println(stack);
		
	}
	
}
