package com.textgui;

public class MenuItem {
	private String name;
	private MenuExec exec;
	
	public MenuItem(String s, MenuExec e) {
		this.name = s;
		this.exec = e;
	}
	
	public void exec() {
		this.exec.execute();
	}
	
	public String getName() {
		return this.name;
	}
}
