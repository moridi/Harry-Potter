package seviceTest;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;
import service.*;

public class PersonServiceTest {
	@Test
	public void getAndSetPersonDataTest() throws IOException{
		Person sev = new Person("Severus Snape");
		PersonService severus = new PersonService(sev);
		
		severus.getData("PersonDB.txt");
		
		Vector<Person> allPersons = severus.getAllPersons();
		String actual = allPersons.get(0).toString();
		String expected = "Person [name=Severus Snape, houseName=Slytherin, bloodStatus=Half_blood, school=Hogwarts, birthday=09.01.1960]";
		Assert.assertEquals(expected, actual);	
		severus.setData(); //Check PersonDB.txt
	}
	
}
