package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1, s2 같은 객체 ? " + 
				(s1 == s2));
	}

}
