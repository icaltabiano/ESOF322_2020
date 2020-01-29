package com.ui.menu;

import java.awt.GridLayout;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.ian.util.Console;
import com.ian.util.Util;

/**
 * @author ian.caltabiano
 */
public class Menu {

	private MenuItem[] menuItems;
	private boolean renderBorder = false;
	private boolean persistent = false;
	private String title = "";

	private int width = 300;
	private int height = 300;
	private int gridWidth = 1;
	private int gridHeight = 6;

	private JFrame activeFrame;

	/**
	 * Creates a Menu object
	 * @param items An array of arbitrary length of menu items in the menu
	 */
	public Menu(MenuItem...items) {
		menuItems = items;
	}

	/**
	 * Sets the title of the menu
	 * @param s The new title of the menu
	 * @return The new menu object to support a factory builder pattern
	 */
	public Menu setTitle(String s) {
		this.title = s;
		return this;
	}

	/**
	 * Calling this function will make the menu render with a border
	 * @return The new menu object to support a factory builder pattern
	 */
	public Menu renderBorder() {
		this.renderBorder = true;
		return this;
	}
	
	/**
	 * Calling this function will make the menu persistent when text rendering (it will continue to run until exited from)
	 * @return The new menu object to support a factory builder pattern
	 */
	public Menu setPersistent() {
		this.persistent = true;
		return this;
	}

	/**
	 * Renders the menu
	 */
	public void textRender() {
		do {
			int ctr = 0;
			if (renderBorder) {
				String z = "";
				for (MenuItem i : menuItems) {
					ctr++;
					z += (ctr + ") " + i.getTextDisplay()) + "\n";
				}
				if (this.title.length() > 0) {
					Console.printBox(z, this.title);
				} else {
					Console.printBox(z, this.title);
				}
			} else {
				for (MenuItem i : menuItems) {
					ctr++;
					Console.print(ctr + ") " + i.getTextDisplay());
				}
			}
			Console.print("");
			int input = Util.clamp(Console.getInt("Please select an option: ") - 1, 0, ctr - 1); //adjust downward and clamp to valid values
			menuItems[input].exec();
		} while (persistent);
	}

	/**
	 * Converts this menu into a JFrame that can be rendered
	 * @return A JFrame that can be displayed
	 */
	public JFrame toJFrame() {
		activeFrame = new JFrame(this.title);
		activeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		activeFrame.setSize(width, height);
		activeFrame.setLayout(new GridLayout(gridHeight, gridWidth));
		for (MenuItem i : this.menuItems) {
			activeFrame.getContentPane().add(i.toComponent());
		}
		return activeFrame;
	}

	/**
	 * Suspends the current menu
	 */
	public void close() {
		if (activeFrame != null) {
			activeFrame.dispatchEvent(new WindowEvent(activeFrame, WindowEvent.WINDOW_CLOSING));
			activeFrame = null;
		} else {
			System.exit(0);
		}
	}
}
