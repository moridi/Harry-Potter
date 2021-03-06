package seviceTest;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;
import service.*;

	public class StudentServiceTest {
		
		@Test
		public void ConstructorTest() {
			Student harry = new Student("Harry Potter");
			
			String actual = harry.getName();
			String expected = "Harry Potter";
			Assert.assertEquals(expected, actual);			
		}		
		
		@Test
		public void getStudentDataTest() throws IOException{
			Student harry = new Student("Harry Potter");
			StudentService harryPotter = new StudentService(harry);
			
			harryPotter.getData("StudentDB.txt");
			
			Vector<Student> allStudents = harryPotter.getAllStudents();
			String actual = allStudents.get(1).toString();
			
			String expected = "Student [Person=Person [name=Harry Potter,"
					+ " houseName=Gryffindor, bloodStatus=Pure_blood,"
					+ " school=Hogwarts, birthday=01.07.1997],"
					+ " courses=6]";
			Assert.assertEquals(expected, actual);	
		
		}
}
