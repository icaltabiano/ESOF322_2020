package com.esof322;

import com.ian.util.Console;
import com.ian.util.Popup;
import com.ui.menu.Menu;
import com.ui.menu.MenuButton;
import com.ui.menu.MenuTextbox;

public class Main {
	public static MenuButton alert;
	public static void main(String[] args) {
		alert = new MenuButton("TestItem", () -> Popup.alert("Test", "Test"));
		Menu menu = new Menu(
				new MenuButton("Say Hello", () -> Console.print("Hello!")),
				new MenuButton("Say Goodbye", () -> Console.print("Goodbye!")),
				new MenuButton("Do a Thing", () -> Popup.alert(Popup.prompt("What do you want me to say?", "Question"), "Alert")),
				alert,
				new MenuTextbox("Text!")
				)
				.setTitle("Test Menu")
				.renderBorder()
				.setPersistent();
//		menu.textRender();
		menu.toJFrame().setVisible(true);
	}

}
