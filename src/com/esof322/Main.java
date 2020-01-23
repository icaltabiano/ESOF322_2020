package com.esof322;


import com.ian.util.Console;
import com.ian.util.Popup;
import com.textgui.menu.Menu;
import com.textgui.menu.MenuItem;

public class Main {
	
	public static void main(String[] args) {
		Menu menu = new Menu(
					new MenuItem("Say Hello", () -> Console.print("Hello!")),
					new MenuItem("Say Goodbye", () -> Console.print("Goodbye!")),
					new MenuItem("Do a Thing", () -> Popup.alert("Here's an alert!", "Alert"))
				)
				.setTitle("Test Menu")
				.renderBorder();
		menu.execute();
	}
	
}
