package com.ian.util;

import javax.swing.JOptionPane;

/**
 * @author ian.caltabiano
 */
public class Popup {
	
	/**
	 * Shows a alert style pop-up
	 * @param msg The message of the alert
	 * @param title The title of the alert
	 */
	public static void alert(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	
	/**
	 * Shows a pop-up that expects a string input
	 * @param msg The message of the pop-up
	 * @param title The title of the pop-up
	 * @return The user inputted string in the query box
	 */
	public static String prompt(String msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	
}
