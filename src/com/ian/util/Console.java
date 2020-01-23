package com.ian.util;

import java.util.Scanner;

public class Console {

	public static void print(String s) {
		System.out.println(s);
	}

	public static void printBox(String s) {
		printBox(s, -1, -1, "");
	}
	
	public static void printBox(String s, String t) {
		printBox(s, -1, -1, t);
	}
	
	public static void printBox(String s, int width, int height, String title) {
		String[] lines = s.split("\\n");
		int maxLength = 0;
		int h = Math.max(lines.length, height);
		for (String testStr : lines) {
			if (testStr.length() > maxLength) {
				maxLength = testStr.length();
			}
		}
		maxLength = Math.max(title.length() + 4, Math.max(maxLength + 1, width));
		for (int a = 0; a < h + 2; a++) {
			if (a == 0 || a == h + 1) {
				if (a == 0) {
					System.out.print("/");
				} else {
					System.out.print("\\");
				}
				String titleString = "";
				if (title.length() == 0 || a != 0) {
					for (int i = 0; i < maxLength; i++) {
						titleString += "=";
					}
				} else {
					titleString = "=[" + title + "]=";
					for (int i = titleString.length(); i < maxLength; i++) {
						titleString += "=";
					}
				}
				System.out.print(titleString);
				if (a == 0) {
					System.out.print("\\");
				} else {
					System.out.print("/");
				}
			} else {
				String spacer = "";
				for (int i = lines[a - 1].length(); i < maxLength; i++) {
					spacer += " ";
				}
				System.out.print("|" + lines[a - 1] + spacer +"|");
			}
			System.out.print("\n");
		}
	}

	public static int getInt(String query) {
		Scanner scan = new Scanner(System.in);
		print(query);
		int i = scan.nextInt();
		scan.close();
		return i;
	}
}
