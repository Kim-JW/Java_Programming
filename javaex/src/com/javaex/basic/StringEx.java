package com.javaex.basic;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		stringEx();
//		stringFormatEx();
		Problem3();
	}
	
	private static void Problem3() {
		for(int i=1; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j+ "\t");
			}
			System.out.println();
		}
	}
	
	private static void stringFormatEx() {
		// %d, %s, %f, %n, %% ...
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었다.");
		
		// 템플릿 문자열
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", 
				total, fruit, eat);
		
		// 현재 이자율은 1.2% 입니다.
		float rate = 1.2f;
		String str = String.format("현재 이자율은 %.2f%% 입니다.%n", rate);
		System.out.println(str);
	}
	
	private static void stringEx() {
		String str1; // 선언
		str1 = "Java"; // Literal
		String str2 = "Java"; // Literal
		String str3 = new String("Java"); // 
		
		System.out.println("str1 == str2 ? " + (str1 == str2)); // 같은 주소를 가지고 있음.
		
		System.out.println("str1 == str3 ? " + (str1 == str3)); // ==는 같은 메모리 주소를 가지고 있는가?
		
		// 참조 객체의 경우, ==, != 은 객체의 메모리주소의 동일성 확인
		// 참조 객체의 값의 비교: equals
		
		// equals는 자바의 모든 객체가 가지고 있음.
		System.out.println("str1과 str3의 값이 같은가? " + str1.equals(str3));
	}

}
