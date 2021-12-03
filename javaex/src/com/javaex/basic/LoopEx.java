package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileEx();
//		Mul();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		breakEx();
		diceEx();
	}
	
	private static void GuguEx3() {
		
	}
	
	private static void diceEx() {
		// 주사위 10번 굴리기
		for (int i =0; i < 10; i++) {
			int dice = (int)(Math.random() * 6) + 1; // 정수난수 생성
			System.out.print(dice + " ");
		}
	}
	
	private static void breakEx() {
		int num = 1;
		
		while(true) {
			if (num % 6 == 0 && num % 14 == 0) break;
			num++;
		}
		System.out.println(num);
	}
	
	private static void continueEx() {
		for (int i = 1; i<=20; i++) {
			if (i %2 == 0 || i %3 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void forGugu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입려하세요:");
		
		int dan = sc.nextInt();
		
		for(int num = 1; num <=9; num++) {
			System.out.println(dan + "*" + num + "=" + dan*num);
		}
		
		sc.close();
	}
	
	private static void doWhileEx() {
		// 최소 1번 반복 수행할 경우: do while
		int total = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력[0이면 종료]:");
			num = scanner.nextInt();
			total += num;
		} while(num != 0);
		
		System.out.println("총합: " + total);
		scanner.close();
	}
	
	private static void Mul() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		
		int dan;
		int i = 1;
		
		dan = sc.nextInt();
		
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
		sc.close();
	}
	
	private static void whileEx() {
		// 1 ~ 10 반복
		int num = 1;
		
		while(num <= 10) {
			System.out.println("I Like Java " + num);
			num++;
		}
	}

}
