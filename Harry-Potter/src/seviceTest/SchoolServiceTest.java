package seviceTest;

import org.junit.Assert;
import org.junit.Test;

import entities.*;

	public class SchoolServiceTest {
		
		@Test
		public void ConstructorTest() {
			School gryff = new School("Gryffindor");
			
			String actual = gryff.getName();
			String expected = "Gryffindor";
			Assert.assertEquals(expected, actual);			
		}		
}
