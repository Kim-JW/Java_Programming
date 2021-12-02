package com.javaex.quiz2;

public class Quiz02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 13579;
		int num2 = 13579;
		
		int n1 = ++num1 +1;
		int n2 = num2++ +1;
		
		if (n1 == n2)
			System.out.println("same");
		else
			System.out.println("different");
	}

}
