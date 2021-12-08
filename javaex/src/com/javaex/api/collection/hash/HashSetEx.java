package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {
	// Hash 알고리즘을 사용하는 Collection
	// HashSet 순서가 없다. 중복을 허용하지 않음.
	public static void main(String[] args) {
//		hashSetEx();
		hashSetCustom();

	}
	
	private static void hashSetCustom() {
		HashSet<Student> hs = new HashSet<Student>();
		
		// Hash code가 다르기 때문에 다른 객체로 인식. 중복 허용
		Student s1 = new Student("홍길동", 1);
		Student s2 = new Student("홍길동", 2);
		Student s3 = new Student("홍길동", 1);
		
		hs.add(s1); hs.add(s2); hs.add(s3);
		
		System.out.println(hs);
	}
	
	private static void hashSetEx() {
		HashSet<String> hs = new HashSet<String>();
		
		// 객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs);
		
		// 원소의 개수
		System.out.println("hs size = " + hs.size());
		
		// 포함 여부
		System.out.println("contatins Java ? " + hs.contains("Java"));
		System.out.println("contatins Linux ? " + hs.contains("Linux"));
		
		// 객체 삭제
		hs.remove("Python");
		System.out.println(hs);
		
		
	}
	
}
