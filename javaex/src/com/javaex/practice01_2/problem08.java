package com.javaex.practice01_2;

import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int total = 0;
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------");
			
			System.out.print("선택>");
			int num = sc.nextInt();
			int money;
			
			switch(num) {
			
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				total += money;
				break;
			case 2:
				System.out.println("출금액");
				money = sc.nextInt();
				total -= money;
				break;
			case 3:
				System.out.println("잔고액>"+ total);
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
				default:
					System.out.println("다시 입력해주세요");
			}
		}
	}

}
