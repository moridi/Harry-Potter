package entities;

import java.util.Vector;

public class Student {
	private Vector<Course> courses;
	private Vector<FinishedCourse> reportCard;
	
	public Vector<Course> getCourses() {
		return courses;
	}
	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}
	public Vector<FinishedCourse> getReportCard() {
		return reportCard;
	}
	public void setReportCard(Vector<FinishedCourse> reportCard) {
		this.reportCard = reportCard;
	}
	
}
