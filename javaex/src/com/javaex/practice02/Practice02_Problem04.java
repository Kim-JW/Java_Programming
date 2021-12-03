package com.javaex.practice02;

import java.util.Arrays;

public class Practice02_Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		int idx = 0;
		
		while(true) {
			int num = (int) (Math.random()*45);
			
			boolean flag = false;
			for(int arr_num : arr) {
				if (num == arr_num) {
					flag = true;
					break;
				}
			
			}
			if (!flag) {
				arr[idx] = num;
				idx++;
			}
			
			if (idx == 6) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
