package com.javaex.practice02;

public class Practice02_Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int cnt =0; int total = 0;
		for(int n: data) {
			if (n %3==0) {
				cnt++;
				total += n;
			}
			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + cnt);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + total);
		
	}

}
