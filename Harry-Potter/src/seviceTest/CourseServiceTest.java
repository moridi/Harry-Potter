package seviceTest;

import service.*;

import org.junit.Assert;
import org.junit.Test;

import entities.*;

	public class CourseServiceTest {
		
		@Test
		public void ConstructorTest() {
			Course flying = new Course("flying");
			CourseService fly = new CourseService(flying);
			Course flyi = fly.getCourse();
			String actual = flyi.getName();
			String expected = "flying";
			Assert.assertEquals(expected, actual);			
		}		
		@Test
		public void setAndGetCourseTest() {
			Course flying = new Course("flying");
			CourseService fly = new CourseService(flying);
			Course flyiing = new Course("flyiiing");
			fly.setCourse(flyiing);
			
			Course flyi = fly.getCourse();
			
			String actual = flyi.getName();
			String expected = "flyiiing";
			Assert.assertEquals(expected, actual);	
		}
}
