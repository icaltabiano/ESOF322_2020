package com.textgui;

import com.esof322.util.Console;

public class Menu {
	
	private MenuItem[] menuItems;

	public Menu(MenuItem...items) {
		menuItems = items;
	}

	/**
	 * Draw the menu
	 */
	public void execute() {
		int ctr = 0;
		for (MenuItem i : menuItems) {
			ctr++;
			Console.print(ctr + "): " + i.getName());
		}
		Console.print("");
		int input = Math.max(0, Math.min(ctr - 1, Console.getInt("Please select an option: ") - 1)); //adjust downward and clamp to valid values
		menuItems[input].exec();
	}
}
