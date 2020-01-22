package com.esof322.util;

import java.util.Scanner;

public class Console {

	public static void print(String s) {
		System.out.println(s);
	}
	
	public static int getInt(String query) {
		Scanner scan = new Scanner(System.in);
		print(query);
		int i = scan.nextInt();
		scan.close();
		return i;
	}
}
