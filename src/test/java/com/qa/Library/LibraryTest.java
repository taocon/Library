package com.qa.Library;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class LibraryTest {

	PeopleRegistry jimManager;
	BookShelf librarian;
	Person jimmy;
	Person richard;
	Book book1;
	Book book2;
	Map map1;
	Map map2;
	Thesis thesis1;
	Thesis thesis2;

	@Before
	public void setup() {
		jimManager = new PeopleRegistry();
		librarian = new BookShelf();
		jimmy = new Person("jimmy", 12, 2,0);
		richard = new Person("Richard", 24, 0,0);
		book1 = new Book("book1", 1, 200, false);
		book2 = new Book("book2", 2, 347, false);
		map1 = new Map("map1", 3, "england", false);
		map2 = new Map("map2", 4, "france", true);
		thesis1 = new Thesis("thesis1", 5, 2, false);

	}

	@Test
	public void peopleListIsEmpty() {

		assertEquals(true, jimManager.getPeopleRegistryEmpty());

	}

	@Test
	public void peopleAddAndCheckList()

	{
		jimManager.addPerson(jimmy);
		jimManager.addPerson(richard);
		jimManager.addPerson(jimManager.customer1);
		assertEquals(3, jimManager.getPeopleRegistry().size());

	}

	@Test
	public void peopleRemoveAndCheckList()

	{

		jimManager.addPerson(jimmy);
		jimManager.addPerson(richard);
		jimManager.addPerson(jimManager.customer1);
		jimManager.remPeopleFromRegistry(jimmy);
		jimManager.lookAtPeopleRegistry();
		jimManager.getPeopleRegistry().size();
		assertEquals(2, jimManager.getPeopleRegistry().size());

	}

	@Test
	public void addItemTest() {
		librarian = new BookShelf();
		librarian.addItemList(book1);
		librarian.addItemList(map1);
		librarian.addItemList(thesis1);
		librarian.getItemList();
		assertEquals(3, librarian.getItemList().size());

	}

	@Test
	public void removeItemTest() {
		librarian = new BookShelf();
		librarian.addItemList(book1);
		librarian.addItemList(map1);
		librarian.addItemList(thesis1);
		librarian.removeItemList(book1);
		librarian.removeItemList(map1);
		librarian.removeItemList(thesis1);
		librarian.getItemList();
		assertEquals(0, librarian.getItemList().size());

	}

	@Test
	public void checkOutItem() {
		librarian.checkOutItem(map2);
		System.out.println(map2.isCheck());
		assertEquals(true, map2.isCheck());

	}

	@Test
	public void checkInItem() {
		librarian.checkInItem(map2);
		assertEquals(false, map2.isCheck());
	}

	@Test
	public void updateItemTest() {
		librarian.updateItem(map1, "id", "6");
		assertEquals(6, map1.getId());

	}
	
	@Test
	public void updatePeopleRegistry() {
		jimManager.updatePeopleRegistry(jimmy, "age", "60");
		assertEquals(60,jimmy.getAge());
	}
	
	@Test
	public void newIdForPeople()
	{
		jimManager.addPerson(jimmy);
		jimManager.addPerson(richard);
		jimManager.getPeopleRegistry();
		jimManager.updateAllId();
		assertEquals(2,richard.getId());
		System.out.println(richard.getId());
	}
}
