package seviceTest;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;
import service.*;

public class ProfessorServiceTest {
	@Test
	public void getAndSetProfessorDataTest() throws IOException{
		Professor sev = new Professor("Severus Snape");
		ProfessorService severus = new ProfessorService(sev);
		
		severus.getData("ProfessorDB.txt");
		
		Vector<Professor> allProfessors = severus.getAllProfessors();
		String actual = allProfessors.get(0).toString();
		String expected = "Professor [person=Person [name=Severus Snape,"
				+ " houseName=Slytherin, bloodStatus=Half_blood,"
				+ " school=Hogwarts, birthday=09.01.1960],"
				+ " notes=He was the bravest man whom ever lived."
				+ " A death eater spy. A.K.A. The Half Blood Prince]";
		Assert.assertEquals(expected, actual);
		
		severus.setData();
	
	}
}
