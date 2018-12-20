package com.qa.Library;

import java.util.ArrayList;

public class PeopleRegistry {

	Person customer1 = new Person("customer1", 24, 0, 0);
	private static int counter = 0;
	private ArrayList<Person> peopleRegistry = new ArrayList<Person>();

	// public void peopleLookup(Person customer1) {
	//
	// System.out.println(customer1.toString());
	//
	// }

	public boolean getPeopleRegistryEmpty() {
		return (peopleRegistry.isEmpty());
	}

	public void addPerson(Person person) {
		this.peopleRegistry.add(person);
	}

	public void remPeopleFromRegistry(Person person) {

		for (Person personnel : peopleRegistry) {
			if (personnel.getName() != person.getName()) {
				peopleRegistry.remove(personnel);
			}
		}

	}

	public int lookAtPeopleRegistry() {
		for (Person eachPerson : peopleRegistry) {

			System.out.println(eachPerson.getName());

		}

		return peopleRegistry.size();
	}

	public ArrayList<Person> getPeopleRegistry() {
		return peopleRegistry;
	}

	public void setPeopleRegistry(ArrayList<Person> peopleRegistry) {
		this.peopleRegistry = peopleRegistry;
	}

	public void updatePeopleRegistry(Person person, String field, String value) {
		switch (field.toLowerCase()) {
		case "age":
			person.setAge(Integer.parseInt(value));
			break;

		case "noOfBooks":
			person.setNoOfBooks(Integer.parseInt(value));
			break;
		case "name":
			person.setName(value);
			break;
		}

	}

	public void updateAllId() {
		for (int i = 0; i < peopleRegistry.size(); i++) {
			counter++;
			System.out.println(counter);
			peopleRegistry.get(i).setId(counter);

		}

	}
}
