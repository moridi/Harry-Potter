package tests;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

import entities.BloodStatus;
import entities.Person;
import entities.House;
import entities.School;

public class PersonTest {

	Person snape;
	@Test
	public void getNameTest()
	{
		snape = new Person("Severus Snape");
		
		String actual = snape.getName();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getHouseTest() throws ParseException
	{
		House house = new House("Slytherin");
		School school = new School("Hogwarts");
		snape = new Person("Severus Snape", house, BloodStatus.Half_blood, school, "9-01-1960");
		House actual = snape.getHouseName();
		String expected = "Slytherin";
		
		Assert.assertEquals(expected, actual.getName());
	}
	@Test
	public void getBloodStatusTest() throws ParseException
	{
		House house = new House("Slytherin");
		School school = new School("Hogwarts");
		snape = new Person("Severus Snape", house, BloodStatus.Half_blood, school, "9-01-1960");
		
		BloodStatus actual = snape.getBloodStatus();
		
//		System.out.println(actual);
		
	}
	@Test
	public void getSchoolTest() throws ParseException
	{
		House house = new House("Slytherin");
		School school = new School("Hogwarts");
		snape = new Person("Severus Snape", house, BloodStatus.Half_blood, school, "9-01-1960");
		School actual = snape.getSchool();
		
//		System.out.println(actual.getName());
	}
	@Test
	public void setNameTest()
	{
		snape = new Person("");
		snape.setName("Severus Snape");
		String actual = snape.getName();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setHouseTest()
	{
		snape = new Person("Severus Snape");
		House house = new House("Slytherin");
		snape.setHouseName(house);
		House actual = snape.getHouseName();
	
//		System.out.println(actual.getName());
			
	}
	@Test
	public void setBloodStatusTest()
	{
		snape = new Person("Severus Snape");
		snape.setBloodStatus(BloodStatus.Half_blood);
		BloodStatus actual = snape.getBloodStatus();
		
//		System.out.println(actual);
		
	}
	@Test
	public void setSchoolTest()
	{
		snape = new Person("Severus Snape");
		School school = new School("Hogwarts");
		snape.setSchool(school);
		School actual = snape.getSchool();
	
//		System.out.println(actual.getName());
		
	}

}
