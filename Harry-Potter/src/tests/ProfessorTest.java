package tests;

import java.util.Map;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import entities.Professor;
import entities.Course;

public class ProfessorTest {
	@Test
	public void coursesTest() 
	{
		Professor prof = new Professor("Madame Hooch");
		Course course = new Course("flying");
		Map<Integer, Course> courses = new HashMap<Integer, Course>();
		courses.put(0, course);
		prof.setCourses(courses);
		
	}

	@Test
	public void getNoteTest() {
		Professor prof = new Professor("Madame Hooch");
			
		String actual = prof.getNotes();
//		System.out.println(actual);	
	}
	
	public void setNotesTest()
	{
		Professor prof = new Professor("Madame Hooch");
		prof.setNotes("Salam!");
		String actual = prof.getName();
		String expected = "Salam!";
		
		Assert.assertEquals(expected, actual);
	}
}

