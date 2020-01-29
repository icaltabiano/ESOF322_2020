package com.ui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author ian.caltabiano
 *
 */
public class MenuButton extends MenuItem {
	
	private MenuExec exec;
	
	/**
	 * Creates a new MenuItem for the purposes of a Menu
	 * @param s The text entry for the menu item
	 * @param e The function to execute when the MenuItem is selected (styled as ()->func();)
	 */
	public MenuButton(String s, MenuExec e) {
		super(s);
		this.exec = e;
	}
	
	/**
	 * What happens on click!
	 */
	public void exec() {
		this.exec.execute();
	}

	
	/**
	 * 
	 * Converts this menu item to a button that can be put onto a JFrame
	 * @return A JComponent object with the menu item functionality
	 */
	public JButton toComponent() {
		MenuButton item = this;
		JButton button = new JButton(this.name);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				item.exec.execute();
			}
		});
		return button;
	}
	
	public String getTextDisplay() {
		return this.name;
	}
}
