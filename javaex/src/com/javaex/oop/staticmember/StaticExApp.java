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
		
		s2 = null;
		System.out.println("s2 해제");
		System.out.println("RefCount: " + StaticEx.refCount);
		
		// 주의: Garbage Collector 직접 호출 안하는게 좋음.
		System.gc();
		
		try {
			Thread.sleep(3000); // 3초 대기
			System.out.println("RefCount: " + StaticEx.refCount);
		} catch (Exception e) {
			
		}
		
	}

}
