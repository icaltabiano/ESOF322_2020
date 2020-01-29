package com.ui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

import com.ian.util.Console;

public class MenuTextbox extends MenuItem {

	public MenuTextbox(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	private String val = "";
	
	@Override
	public JComponent toComponent() {
		MenuTextbox item = this;
		JTextField field = new JTextField(this.val);
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				item.val = field.getText();
			}
		});
		return field;
	}

	@Override
	public String getTextDisplay() {
		// TODO Auto-generated method stub
		if (val.length() == 0) {
			return this.name;
		}
		return this.name + " (" + this.val + ")";
	}

	@Override
	public void exec() {
		this.val = Console.getString("What do you want to input?");

	}

}
