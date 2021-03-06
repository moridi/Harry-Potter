package tests;


import java.util.ArrayList;
import java.util.Vector;
import org.junit.Assert;
import org.junit.Test;

import entities.School;
import entities.Course;
import entities.House;
import entities.Student;
import entities.Professor;

public class SchoolTest {

	private School hogwarts;

	@Test
	public void getNameTest()
	{
		hogwarts = new School("Hogwarts");
		String expected = "Hogwarts";
		String actual = hogwarts.getName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getCoursesTest()
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Potions"));
		courses.add(new Course("Divination"));
		courses.add(new Course("Magical Creatures"));
		courses.add(new Course("Defense Against The Dark Arts"));
		courses.add(new Course("Transfiguration"));

		hogwarts = new School("Hogwarts", null, courses, null, null, null);
		ArrayList<Course> actual = hogwarts.getCourseNames();
	
		for(Course x : actual)
		{
//			System.out.println(x.getName());
		}
	}
	@Test
	public void getHousesTest()
	{
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House("Gryffindor"));
		houses.add(new House("Hufflepuff"));
		houses.add(new House("Ravenclaw"));
		houses.add(new House("Slytherin"));
		hogwarts = new School("Hogwarts", houses, null, null, null, null);
		ArrayList<House> actual = hogwarts.getHouseNames();
		
		for(House x : actual)
		{
//			System.out.println(x.getName());
		}
		
	}
	@Test
	public void getStudentsTest()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		
		hogwarts = new School("Hogwarts", null, null, null, null, null);
		
		Vector<Student> actual = hogwarts.getStudentNames();	
	}
	@Test
	public void getProfessorsTest()
	{
		/*public School(String name, ArrayList<String> houses, ArrayList<String> course#s,
		ArrayList<Integer> years, Vector<String> students, Vector<String> professors)*/
		Vector<Professor> professors = new Vector<Professor>();
		professors.add(new Professor("Severus Snape"));
		hogwarts = new School("Hogwarts", null, null, null, null, null);
		
	}

	
	@Test
	public void setCoursesTest()
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Potions"));
		courses.add(new Course("Divination"));
		courses.add(new Course("Magical Creatures"));
		courses.add(new Course("Defense Against The Dark Arts"));
		courses.add(new Course("Transfiguration"));
		courses.add(new Course("Charms"));
		courses.add(new Course("Astronomy"));
		courses.add(new Course("Flying"));
		courses.add(new Course("Herbology"));
		courses.add(new Course("History of Magic"));

		hogwarts = new School("Hogwarts");
		hogwarts.setCourseNames(courses);
		ArrayList<Course> actual = hogwarts.getCourseNames();
	
		for(Course x: actual)
		{
//			System.out.println(x.getName());
		}
	}
	@Test
	public void setHousesTest()
	{
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House ("Gryffindor"));
		houses.add(new House ("Hufflepuff"));
		houses.add(new House ("Ravenclaw"));
		houses.add(new House ("Slytherin"));
		hogwarts = new School("Hogwarts");
		hogwarts.setHouseNames(houses);
		ArrayList<House> actual = hogwarts.getHouseNames();
		
		for(House x:actual)
		{
//			System.out.println(x);
		}
	}
	@Test
	public void setStudentsTest()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Luna Lovegood"));
		students.add(new Student("Lucius Malfoy"));
		hogwarts = new School("Hogwarts");
		hogwarts.setStudentNames(students);
		Vector<Student> actual = hogwarts.getStudentNames();
	
		for(Student x:actual)
		{
//			System.out.println(x.getName());
		}
	}

}
