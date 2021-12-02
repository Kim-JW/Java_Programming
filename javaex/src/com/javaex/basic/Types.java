package com.javaex.basic;
import java.util.*;

public class Types {
	public static void main(String[] args) {
		//intLongEx();
//		floatDoubleEx();
//		charEx();
//		booleaEx();
//		promotionEx();
		castingEx();
	}
	
	// 형 변환
	private static void castingEx() {
		// 표현 범위가 넓은 자료 -> 표현 범위 좁은 자료
		// 명시적으로 변환 해줘야함
		float f = 123.456f;
		System.out.println(f);
		
		int i = (int)f;
		
		System.out.println(i);
		
		int i2 = 1234567890;
		System.out.println(i2);
		System.out.println(Integer.toBinaryString(i2));
		
		short s = (short)i2;
		System.out.println(Integer.toBinaryString(s));
		
		// 형 변환시 자료 유실이 일어날 수 있으므로 주의
		
		
	}
	
	// 형 변환(Promotion)
	private static void promotionEx() {
		// 표현 범위 좁은 자료 -> 넓은 자료형
		byte b = 25; // 1바이트
		System.out.println(b);
		
		short s = b;
		System.out.println(s); // 2바이트 정수
		
		int i = 123123; // 4바이트 정수
		System.out.println(i);
		
		System.out.println((byte)i);
		
		float f = i; // 4 바이트 실수형
		System.out.println(f);
		
		System.out.println();
		
	}
	
	// 논리형 : 참 or 거짓
	private static void booleaEx() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(!b1);
		
		boolean result;
		
		int var1 = 3, var2 = 5;
		
		result = var1 < var2;
		System.out.println(result);
		
	}
	
	// 문자형 타입: 부호 없는 정수(코드)
	private static void charEx() {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// ch1 4글자 뒤
		
		System.out.println(ch1 + 4); // 큰 자료형으로 바뀐다.
		System.out.println((char)(ch1 + 4));
		
	}
	
	private static void floatDoubleEx() {
		// float(4) < double(8:default)
		// 정밀도 포기, 표현 범위 넓힌 것
		
		float floatVar = 3.14159f; // double이 디폴트이기 때문에 f 붙여줘야함.
		double doubleVar = 3.14159;
		
		floatVar = 0.1234567890123456789f;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float = " + floatVar);
		System.out.println("double = " + doubleVar);
		
		System.out.println(0.1 *3); // 정밀도를 포기했기 때문에 부정확하게 나올수 있다.
		
		//지수 표기법(e)
		floatVar = 3E-6F; // 3 * 10 ^ -6
		System.out.println(floatVar);
	}
	
	// 정수형 타입
	public static void intLongEx() {
		//  byte(1) < short(2) < int(4:default) < long(8)
		int intVar1; // 선언
		int intVar2;
		
		intVar1 = 2021; // 초기화
		//intVar2 = 12345678901234; 범위 초과
		
		System.out.println(intVar1);
		
		long longVar1 = 2021;
		long longVar2 = 12345678901234l;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2진수, 8진수, 16진수
		// Ob	0	   0x	
		
		int bin, oct, hex;
		bin = 0b1101;
		oct = 0231;
		hex = 0xFF;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println(bin + oct + hex);
		
	}
}
