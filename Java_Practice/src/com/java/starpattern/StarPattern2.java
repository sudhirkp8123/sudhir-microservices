package com.java.starpattern;

import java.util.Scanner;

public class StarPattern2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter number:");
		Integer n = new Scanner(System.in).nextInt();
		System.out.println("");
		generateStarPattern(n);

	}

	private static void generateStarPattern(Integer n) {
		
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i; j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
