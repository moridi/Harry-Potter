package service;

import java.util.Vector;

import entities.*;

public class PersonService {
	
	private Person person;//The Person the services are performed on/at
	
	private Vector<Person> allPersons; //All the persons in the system
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Vector<Person> getAllPersons() {
		return allPersons;
	}

	public void setAllPersons(Vector<Person> _allPersons) {
		allPersons = _allPersons;
	}

	public PersonService(Person person) {
		this.person = person;
	}

	public void getData(String fileName) /* implement this method such that you will
	receive the file name (PersonDB.txt) as an input and inside the method you
	will open that file, read it and will fill up the information for each person (fill the
	vector)*/
	{
		
	}
	
	public void setData()
	/* implement this method so you can fill
	your database using the vector of persons you have */
	{
		
	}
}