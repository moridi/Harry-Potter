package tests;

import org.junit.Test;

import entities.FinishedCourse;
import entities.Grade;

//private Grade grade;
//private boolean passed;


public class FinishedCourseTest {

	@Test
	public void getGradeTest() {
		FinishedCourse course = new FinishedCourse("Flying", Grade.O, false);
		
		Grade actual = course.getGrade();
//		System.out.println(actual.toString());			
		
	}
	
	@Test
	public void setGradeTest() {
		FinishedCourse course = new FinishedCourse("Flying");
		
		course.setGrade(Grade.O);
//		System.out.println(course.getGrade().toString());			
		
	}
	@Test
	public void getPassedTest() {
		FinishedCourse course = new FinishedCourse("Flying", Grade.O, false);
		
		boolean actual = course.isPassed();
//		System.out.println(actual);			
		
	}
	
	@Test
	public void setPassedTest() {
		FinishedCourse course = new FinishedCourse("Flying");
		
		course.setPassed(false);
//		System.out.println(course.isPassed());			
		
	}
	
}

