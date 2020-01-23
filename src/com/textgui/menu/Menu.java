package com.textgui.menu;

import com.ian.util.Console;

public class Menu {

	private MenuItem[] menuItems;
	private boolean renderBorder = false;
	private String title = "";

	public Menu(MenuItem...items) {
		menuItems = items;
	}

	public Menu setTitle(String s) {
		this.title = s;
		return this;
	}

	/**
	 * Make the menu render with a border
	 */
	public Menu renderBorder() {
		this.renderBorder = true;
		return this;
	}

	/**
	 * Draw the menu
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
		int input = Math.max(0, Math.min(ctr - 1, Console.getInt("Please select an option: ") - 1)); //adjust downward and clamp to valid values
		menuItems[input].exec();

	}
}
