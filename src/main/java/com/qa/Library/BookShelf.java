package com.qa.Library;

import java.util.ArrayList;

public class BookShelf {

	Item gameOfThrones = new Book("red", 4, 700, false);

	ArrayList<Item> itemList = new ArrayList<Item>();

	public void addItemList(Item item) {
		this.itemList.add(item);
	}

	public void removeItemList(Item item) {
		this.itemList.remove(item);
	}

	public void checkOutItem(Item item) {
		if (!item.isCheck()) {
			item.setCheck(true);
			System.out.println("checked out successfully");
		} else {
			System.out.println("Cannot check out");
		}
	}

	public void checkInItem(Item item) {

		if (item.isCheck()) {
			item.setCheck(false);
			System.out.println("Checked in successfully");
		} else {
			System.out.println("Already checked in?");
		}

	}
	
	public void updateItem(Item item,String field,String value ) {
		
		switch (field.toLowerCase())
		{
		case "name":
			item.setName(value);
			break;
		case "id":
			item.setId(Integer.parseInt(value));
			break;
		case "area":
			((Map) item).setArea(value);
			break;
		}
		
	}
	
	
	

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

}