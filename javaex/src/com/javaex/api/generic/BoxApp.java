package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		IntBox iBox = new IntBox();
		iBox.setContent(10);
		System.out.println("IntBox: " + iBox.getContent());
		
		StrBox sBox = new StrBox();
		sBox.setContent("String");
		System.out.println("StrBox: " + sBox.getContent());
		
		ObjBox oBox = new ObjBox();
		oBox.setContent(10);
		oBox.setContent("String");
		
		String value = (String)oBox.getContent(); // 다운캐스팅 필요
		System.out.println("content: " + value);
//		int iValue = (Integer)oBox.getContent(); 컴파일러가 못 잡는 Error 발생.
		
		GenericBox<Integer> intGBox = new GenericBox<Integer>();
		intGBox.setContent(10);
		// 1. 컴파일러에서 타입 체크 가능
		// 2. 다운캐스팅의 불편을 해소
		Integer iValue = intGBox.getContent();
		System.out.println("content: " + iValue);
		
		GenericBox<String> strGBox = new GenericBox<String>();
		// GenericBox<String> strGBox = new GenericBox<>(); <- 생략 가능, 일반적 방법

	}

}
