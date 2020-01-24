package com.ui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author ian.caltabiano
 *
 */
public class MenuItem {
	private String name;
	private MenuExec exec;
	
	/**
	 * Creates a new MenuItem for the purposes of a Menu
	 * @param s The text entry for the menu item
	 * @param e The function to execute when the MenuItem is selected (styled as ()->func();)
	 */
	public MenuItem(String s, MenuExec e) {
		this.name = s;
		this.exec = e;
	}
	
	/**
	 * Executes the menu item
	 */
	public void exec() {
		this.exec.execute();
	}

	/**
	 * Retrieves the string of the menu item
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * Converts this menu item to a button that can be put onto a JFrame
	 * @return A JButton object with the menu item functionality
	 */
	public JButton toButton() {
		MenuItem item = this;
		JButton button = new JButton(this.name);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				item.exec.execute();
			}
		});
		return button;
	}
}
