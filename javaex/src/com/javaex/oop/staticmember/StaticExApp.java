package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s0;
		
		System.out.println(StaticEx.refCount);
		
		StaticEx s1 = new StaticEx();
		// static 멤버는 new 없이 접근 가능
		System.out.println("RefCount: "+ StaticEx.refCount);
		
		StaticEx s2 =  new StaticEx();
		// static 멤버는 new 없이 접근 가능
		System.out.println("RefCount: "+ StaticEx.refCount);
		
		
	}

}
