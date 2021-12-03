package com.javaex.practice02;

public class Practice02_Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T', 'h', 'i','s',' ', 'i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(char cc: c) {
			System.out.print(cc);
		}
		
		for(int i=0; i< c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
		System.out.println();
		for(char cc: c) {
			System.out.print(cc);
		}
	}

}
