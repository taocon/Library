package com.qa.Library;

public abstract class Item {

	private String name;
	private int id;
	private boolean checkOut = false;

	public Item(String name, int id, boolean checkOut) {
		this.setName(name);
		this.setId(id);
		this.setCheck(checkOut);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCheck() {
		return checkOut;
	}

	public void setCheck(boolean check) {
		this.checkOut = check;
	}

}
