package com.esof322;


import com.ian.util.Console;
import com.ian.util.Popup;
import com.ui.menu.TextMenu;
import com.ui.menu.GuiLoginMenu;
import com.ui.menu.MenuItem;

public class Main {
	public static MenuItem alerty;
	public static void main(String[] args) {
		alerty = new MenuItem("TestItem", () -> Popup.alert("Test", "Test"));
		TextMenu menu = new TextMenu(
				new MenuItem("Say Hello", () -> Console.print("Hello!")),
				new MenuItem("Say Goodbye", () -> Console.print("Goodbye!")),
				new MenuItem("Do a Thing", () -> Popup.alert(Popup.prompt("What do you want me to say?", "Question"), "Alert")),
				alerty
				)
				.setTitle("Test Menu")
				.renderBorder();
		menu.execute();
		new GuiLoginMenu();
	}

}
