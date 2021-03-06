package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Heap 메모리 안에 객체 생성
		Goods notebook = new Goods();
		notebook.setName("Macbook Air");
		notebook.setPrice(1600000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone 13");
		smartphone.setPrice(1000000);
		
		System.out.printf("%s, %d원%n",
				notebook.getName(),
				notebook.getPrice());
		
		notebook.showInfo();
		
		System.out.printf("%s, %d원%n",
				smartphone.getName(),
				smartphone.getPrice());
		
		smartphone.showInfo();
		
	}

}
