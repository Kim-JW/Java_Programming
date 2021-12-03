package com.javaex.practice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random()*100);
		
		System.out.println("========================");
		System.out.println("   [숫자맞추기게임 시작]     ");
		System.out.println("========================");
		System.out.println(answer);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			while(true) {
				System.out.print(">>");
				int num = sc.nextInt();
				
				if (answer > num) {
					System.out.println("더 높게");
				}else if(answer < num) {
					System.out.println("더 낮게");
				}else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			
			sc = new Scanner(System.in);
			
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			String exit_flag = sc.nextLine();
			
			if (exit_flag.equals("y")) {
				System.out.println("========================");
				System.out.println("   [숫자맞추기게임 종료]     ");
				System.out.println("========================");
				sc.close();
				break;
			}
	
		}
	}

}
