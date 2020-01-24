package com.ui.menu;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.esof322.Main;

public class GuiLoginMenu extends GuiMenu {

	@Override
	public void init() {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JButton button = Main.alerty.toButton();
		frame.getContentPane().add(button); // Adds Button to content pane of frame
		frame.setVisible(true);	
	}
}
