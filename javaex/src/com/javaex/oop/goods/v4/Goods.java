package com.javaex.oop.goods.v4;

// v4: this
// this : 현재 인스턴스 자체, 자신을 지칭
// this() : 현재 클래스 내의 다른 생성자 호출

public class Goods {
	// 필드
	
	private String name;
	private int price;
	
	// 생성자
	// 생성자를 선언하지 않으면 컴파일러가 기본 생성자를 끼워 넣는다.
	// 생성자를 선언하면
	// 컴파일러는 기본 생성자를 끼워넣지 않는다.
	
	// 생성자 1.
	public Goods(String name) {
		this.name = name;
	}
	
	// 생성자 2.
	public Goods(String name, int price) {
		this(name); // 다른 생성자 호출
		this.price = price;
	}
	
	// 외부 접근 방식 노출
	// getter/setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	// setter가 없으면 ReadOnly
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
