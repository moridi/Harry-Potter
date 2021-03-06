package tests;

import java.util.Vector;

import org.junit.Test;

import entities.Course;
import entities.Grade;
import entities.Student;
import entities.Professor;

public class CourseTest {
	Course flying;

	@Test
	public void studentsTest() 
	{
		flying = new Course("flying");
		Vector<Student> students = new Vector<Student>();
		Student temp = new Student("Harry Potter");
		students.add(temp);
		flying.setStudentNames(students);
		
		Vector<Student> actual = flying.getStudentNames();
//		System.out.println(actual.toString());			

		
	}
	@Test
	public void getProfessorTest() {
		Professor prof = new Professor("Madame Hooch");
		flying = new Course("flying", prof, Grade.O, 1996);
		Professor actual = flying.getProfessorName();
//		System.out.println(actual.toString());			
		
	}
	@Test
	public void getNameTest() {
		Professor prof = new Professor("Madame Hooch");
		flying = new Course("flying", prof, Grade.O, 1996);
		String actual = flying.getName();
//		System.out.println(actual);	
	}
	@Test
	public void getMinGradeTest() {
		Professor prof = new Professor("Madame Hooch");
		flying = new Course("flying", prof, Grade.O, 1996);
		Grade actual = flying.getMinGrade();
//		System.out.println(actual.toString());			
		
	}
	@Test
	public void setProfessorTest() {
		flying = new Course("Flying");
		Professor prof = new Professor("Madame Hooch");
		flying.setProfessorName(prof);
		Professor actual = flying.getProfessorName();
//		System.out.println(actual.toString());			

	}
	@Test
	public void setNameTest() {
		flying = new Course("");
		flying.setName("Flying");
		String actual = flying.getName();
//		System.out.println(actual.toString());			
	
	}
}

