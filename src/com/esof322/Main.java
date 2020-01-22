package com.esof322;

import com.esof322.util.Console;
import com.textgui.Menu;
import com.textgui.MenuItem;

public class Main {
	
	public static void main(String[] args) {
		Menu menu = new Menu(
					new MenuItem("Say Hello", () -> Console.print("Hello!")),
					new MenuItem("Say Goodbye", () -> Console.print("Goodbye!"))
				);
		menu.execute();
	}
	
}
