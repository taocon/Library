package com.qa.Library;

public class Person {

	private String name;
	private int age;
	private int noOfBooks;
	private int id;
	
	public Person(String name,int age,int noOfBooks,int id)
	{
		this.setName(name);
		this.setAge(age);
		this.setNoOfBooks(noOfBooks);
		this.setId(id);
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", noOfBooks=" + noOfBooks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
