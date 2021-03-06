package com.javaex.basic;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arithOperEx();
//		prefixIncrEx();
//		suffixIncrEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}
	
	// 3항 연산자
	private static void conditionalOperEx() {
		int a = 10;
		// a가 짝수면 짝수, 홀수면 홀수 출력
		System.out.println(a + "는" + (a % 2 == 0 ? "짝수" : "홀수"));
		
		int score = 85;
		String message;
		
		// 점수가 90점 이상이면 Good, 50점 미만이면 Fail, 아니면 Pass
		message = score >= 90 ? "Good" : score < 50 ? "Fail" : "Pass";
		System.out.println(message);
	}
	
	private static void bitShiftOperEx() {
		int val = 1;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 3));
		
		val = 0b1000;
		System.out.println(Integer.toBinaryString(val >> 2));
	}
	
	private static void bitOperEx() {
		// int에서만 사용가능
		// 비트 단위 미세한 제어에 이용
		int b1 = 0b11011101;
		int mask = 0b10101010;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(mask));
		
		System.out.println(Integer.toBinaryString(b1 & mask));
		System.out.println(Integer.toBinaryString(b1 | mask));
		System.out.println(Integer.toBinaryString(~b1));
		
	}
	
	// 비교, 논리연산
	private static void logicalOperEx() {
		// 비교연산자: >, >=, <=, ==(equal), !=(not equal)
		// 논리연산자: 논리곱(AND, &&), 논리합(OR, ||), 논리부정(NOT, !)
		int a = 5;
		// a가 0초과, 10미만의 값?
		// 조건1: a > 0
		// 조건2: a < 10
		// 결과 : 조건1 AND 조건2
		boolean b1 = a > 0;
		boolean b2 = a < 10;
		
		boolean r = b1 && b2;
		
		System.out.println(r);
		
		// a가 0이하 이거나 10이상의 값?
		// 조건1: a <= 0
		// 조건2: a >= 10
		b1 = a <=0;
		b2 = a >=10;
		
		r = b1 || b2;
		System.out.println(r);
		
		// 논리 부정(NOT !)
		System.out.println("!b == " + !r);
	}
	
	// 후위증감
	private static void suffixIncrEx() {
		int a = 7;
		int b = 0;
		
		b = a++;
		System.out.println(b);
		System.out.println(a);
	}
	
	// 전위증감
	private static void prefixIncrEx() {
		int a = 7;
		int b = 0;
		
		b = ++a;
		System.out.println(b);
		System.out.println(a);
	}
	
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호 연산자(+, -)
		System.out.println(-a);
		
		// 산술연산(+,-,*,/, %)
		System.out.println(a / b); // int / int -> int
		System.out.println(a % b); // 정수 나눗셈의 나머지
		
		//System.out.println(a / 0); // int / 0
		System.out.println(7.0 / 0);
		System.out.println(7.0 / 0 ); // Infinity가 포함된 산술식 -> Infinity
		
		// Infinity 체크
		System.out.println(Double.isInfinite(7.0/0));
		// 데이터가 NaN인지 확인 (Not a Number)
		System.out.println(0.0 / 0.0);
		System.out.println(Double.isNaN(0.0/0.0));
		System.out.println(Double.isNaN(7.0/0.0));
	}

}
