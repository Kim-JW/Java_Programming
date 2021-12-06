package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
//		// 기본 생성자 호출
//		p1.setX(10);
//		p1.setY(10);
		
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
		Point p2 = new Point(30, 40);
		
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		System.out.println();
		
		ColorPoint cp1 = new ColorPoint(10, 20, "Red");
		cp1.draw(true);
		
		Point cp2 = new ColorPoint(30, 40, "Green");
		cp2.draw(true);
	}

}
