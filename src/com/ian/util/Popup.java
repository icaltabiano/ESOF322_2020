package com.ian.util;

import javax.swing.JOptionPane;

public class Popup {
	
	public static void alert(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	
}
