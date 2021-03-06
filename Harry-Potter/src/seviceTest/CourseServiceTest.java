package seviceTest;

import service.*;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;

	public class CourseServiceTest {
		
		@Test
		public void ConstructorTest() throws IOException {
			Course flying = new Course("flying");
			CourseService fly = new CourseService(flying);
			Course flyi = fly.getCourse();
			String actual = flyi.getName();
			String expected = "flying";
			Assert.assertEquals(expected, actual);			
		}		
		@Test
		public void setAndGetCourseTest() throws IOException {
			Course flying = new Course("flying");
			CourseService fly = new CourseService(flying);
			Course flyiing = new Course("flyiiing");
			fly.setCourse(flyiing);
			
			Course flyi = fly.getCourse();
			
			String actual = flyi.getName();
			String expected = "flyiiing";
			Assert.assertEquals(expected, actual);	
		}
		
		@Test
		public void getAndSetCourseDataTest() throws IOException{
			Course flying = new Course("flying");
			CourseService fly = new CourseService(flying);
			fly.getData("CourseDB.txt");
			Vector<Course> allCourses = fly.getAllCourses();
			String actual = allCourses.get(0).toString();
			String expected = "Course [name=Potions, professorName=Severus Snape, minGrade=O, year=1992]";
			Assert.assertEquals(expected, actual);	
			
			fly.setData();//Check CourseDB.txt
		
		}
}
