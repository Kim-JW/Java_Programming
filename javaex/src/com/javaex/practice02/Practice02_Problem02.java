package com.javaex.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Practice02_Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int total = 0;
		
		for(int i =0; i< 5; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		System.out.printf("평균은 %.1f 입니다.", (float)(total/5));

	}

}
