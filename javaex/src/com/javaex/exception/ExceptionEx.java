package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithExceptionEx();
	}
	
	private static void arithExceptionEx() {
		double result = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		
		// 예외 발생 가능 영역
		try {
			num = sc.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.err.println("정수로 해주세요");
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌수 없음.");
		} catch (Exception e) { // 모든 예외 처리 가능
			e.printStackTrace();
		} finally { // 주로 자원 정리 작업에 많이 활용, 예외 유뮤 관계 없이 가장 마지막에
			System.out.println("예외 처리 종료");
			System.out.println(result);
			sc.close();
		}

	}

}
