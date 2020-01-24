package com.ui.menu;

import com.ian.util.Console;
import com.ian.util.Util;

/**
 * @author ian.caltabiano
 */
public class TextMenu {

	private MenuItem[] menuItems;
	private boolean renderBorder = false;
	private String title = "";

	/**
	 * Creates a Menu object
	 * @param items An array of arbitrary length of menu items in the menu
	 */
	public TextMenu(MenuItem...items) {
		menuItems = items;
	}

	/**
	 * Sets the title of the menu
	 * @param s The new title of the menu
	 * @return The new menu object to support a factory builder pattern
	 */
	public TextMenu setTitle(String s) {
		this.title = s;
		return this;
	}

	/**
	 * Calling this function will make the menu render with a border
	 * @return The new menu object to support a factory builder pattern
	 */
	public TextMenu renderBorder() {
		this.renderBorder = true;
		return this;
	}

	/**
	 * Renders the menu
	 */
	public void execute() {
		int ctr = 0;
		if (renderBorder) {
			String z = "";
			for (MenuItem i : menuItems) {
				ctr++;
				z += (ctr + ") " + i.getName()) + "\n";
			}
			if (this.title.length() > 0) {
				Console.printBox(z, this.title);
			} else {
				Console.printBox(z, this.title);
			}
		} else {
			for (MenuItem i : menuItems) {
				ctr++;
				Console.print(ctr + ") " + i.getName());
			}
		}
		Console.print("");
		int input = Util.clamp(Console.getInt("Please select an option: ") - 1, 0, ctr - 1); //adjust downward and clamp to valid values
		menuItems[input].exec();

	}
}
