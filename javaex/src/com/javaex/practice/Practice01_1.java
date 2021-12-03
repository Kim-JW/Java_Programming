package com.javaex.practice;

import java.util.Scanner;

public class Practice01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		p1();
//		p2();
//		p3();
//		p4();
		p5();
	}
	
	private static void p1() {
		for(int i=1; i<= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static void p2() {
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j =0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	private static void p3() {
		for(int i=1; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j+ "\t");
			}
			System.out.println();
		}
	}
	
	private static void p4() {
		for(int i=0; i<10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(j+i + "\t");
			}
			System.out.println();
		}
	}
	
	private static void p5() {
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int max = -1;
		
		for(int i=0; i< 5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (max < num) {
				max = num;
			}
		}
		System.out.println("최댓값은 " + max+"입니다.");
		sc.close();
	}

}
