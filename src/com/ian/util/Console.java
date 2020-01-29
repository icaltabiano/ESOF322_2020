package com.ian.util;

import java.util.Scanner;

/**
 * @author ian.caltabiano
 */
public class Console {

	/**
	 * Encapsulation for System.out.println
	 * @param s The string to print to the console
	 */
	public static void print(String s) {
		System.out.println(s);
	}
	
	/**
	 * Prints a stylized box containing the given text (use \n to escape new lines)
	 * @param s The string to contain in the box
	 */

	public static void printBox(String s) {
		printBox(s, -1, -1, "");
	}
	
	/**
	 * Prints a stylized box containing the given text an having a given title
	 * @param s The string to contain in the box
	 * @param t The title of the box
	 */
	
	public static void printBox(String s, String t) {
		printBox(s, -1, -1, t);
	}
	
	
	/**
	 * Prints a stylized box containing the given text, having a given title, and having given minimum dimensions
	 * @param s The string to contain in the box
	 * @param width The minimum width of the box in terms of charspace
	 * @param height The minimum height of the box in terms of charspace
	 * @param title The title of the box
	 */
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

	/**
	 * Prints a query and expects an integer respose
	 * @param query The query to print to the console
	 * @return The next integer to be entered into the console
	 */
	public static int getInt(String query) {
		Scanner scan = new Scanner(System.in);
		print(query);
		int i = scan.nextInt();
		return i;
	}
	
	/**
	 * Prints a query and expects a string response
	 * @param query The query to print to the console
	 * @return The next string to be entered into the console
	 */
	public static String getString(String query) {
		Scanner scan = new Scanner(System.in);
		print(query);
		String s = scan.next();
		return s;
	}
}
