package com.javaex.quiz2;

public class Quiz02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz_1();
	}
	
	private static void quiz_1() {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		// 1
		System.out.println((a % 2 == 0) ? true : false);
		
		// 2
		System.out.println((b % 3 == 0) ? true : false);
		
		// 3
		boolean b1 = a % 2 == 0;
		boolean b2 = b % 3 == 0;
		boolean r = b1 & b2;
		System.out.println(r);
		
		int r2 = c + 4;
		System.out.println(r2);
	}

}
