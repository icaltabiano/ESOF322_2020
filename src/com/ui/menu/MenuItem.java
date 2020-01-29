package com.ui.menu;

import javax.swing.JComponent;

/**
 * 
 * @author ian.caltabiano
 *
 */
public abstract class MenuItem {
	protected String name;
	
	
	/**
	 * Creates a new MenuItem for the purposes of a Menu
	 * @param s The text entry for the menu item
	 * @param e The function to execute when the MenuItem is selected (styled as ()->func();)
	 */
	public MenuItem(String s) {
		this.name = s;
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
	 * @return A JComponent object with the menu item functionality
	 */
	public abstract JComponent toComponent();

	/**
	 * What does this item look like in a text-only display?
	 * @return The console text appearance
	 */
	public abstract String getTextDisplay();
	
	/**
	 * Called when the object is selected in a text menu
	 */
	public abstract void exec();
}
