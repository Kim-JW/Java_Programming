package com.javaex.api.collection.list;

import java.util.Stack;

// Stack : Last Input First Output(LIFO: 후입선출)
public class StackEx {

	public static void main(String[] args) {
		// 스택 선언
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=1; i<=10; i++) {
			// push
			stack.push(i);
			System.out.println("STACK: " + stack);
		}
		
		// 가장 위 데이터를 확인: peek
		System.out.println("PEEK" + stack.peek());
		
		// 인출: pop
		System.out.println("POP: " + stack.pop());
		
		while(!stack.isEmpty()) { // 인출 전에 비어있는지 체크
			System.out.println("POP: " + stack.pop());
			System.out.println("STACK: " + stack);
		}

	}

}
