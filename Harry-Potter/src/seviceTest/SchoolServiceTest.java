package seviceTest;

import org.junit.Assert;
import org.junit.Test;

import entities.*;
import service.*;

	public class SchoolServiceTest {

		@Test
		
		public void constructorTest() {	
			School gryff = new School("Gryffindor");
			SchoolService schoolServe = new SchoolService(gryff);
			String actual = schoolServe.getSchool().getName();
			String expected = "Gryffindor";
			Assert.assertEquals(expected, actual);	
			
		}	
		@Test
		public void questionsTest() {
			School gryff = new School("Gryffindor");
			SchoolService schoolServe = new SchoolService(gryff);
			
			Student harry = new Student("Harry Potter");
			House house = schoolServe.sortintHat(harry); //Slytherin
			
			String actual = house.getName();
			String expected = "Slytherin";
			Assert.assertEquals(expected, actual);	
		}
}
