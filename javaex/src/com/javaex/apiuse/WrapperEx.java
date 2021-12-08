package com.javaex.apiuse;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = new Integer(10); // deprecasted
		
		Integer i2 = Integer.valueOf(10);
		Integer i3 = Integer.valueOf("10");
		
		// 자동 박싱
		Integer i4 = 10; // Integer i4 = Integer.valueOf(10);
		
		// 자동 언박싱
		int value = i4; // int value = i4.intValue();
		
		// 포장된 값의 비교
		System.out.println(i == i2); // 객체 주소값의 비교(주의), Wrapper 클래스도 객체다.
		System.out.println(i.intValue() == i2.intValue());
		System.out.println(i.equals(i2));
		
	}

}
