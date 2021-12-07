package com.javaex.oop.point.v4;

// v4. 상속
public class Point {
//	private int x;
//	private int y;
	
	public int num2 =0;
	
	protected int x;
	protected int y;
	
	// 매개 변수가 없는 생성자
//	public Point() {
//		
//	}
	
	// 전체 필드 초기화 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",
				x, y);
	}
	
	// 메서드 오버로딩
	// 매개변수 타입, 개수, 순서가 다르고 같은 이름
	
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d, y=%d]을 ", x, y);
		
		if (bDraw) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		
		System.out.println(message);
	}
	
}
