package entities;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Map;

public class House {
	private String name;
	private School school;
	private Vector<Student> students;
	private Professor HeadTeacher;
	private ArrayList<String> qualities;
	private Map<Integer, Student> prefects;
	
	
	
	public House(String name, School school, Vector<Student> students, Professor headTeacher,
			ArrayList<String> qualities, Map<Integer, Student> prefects) {
		this.name = name;
		this.school = school;
		this.students = students;
		HeadTeacher = headTeacher;
		this.qualities = qualities;
		this.prefects = prefects;
	}
	
	public House()
	{
		this.name = null;
		this.school = null;
		this.students = null;
		HeadTeacher = null;
		this.qualities = null;
		this.prefects = null;
	}	
	
	
	@Override
	public String toString() {
		return "House [name=" + name + ", school=" + school + ", students=" + students + ", HeadTeacher=" + HeadTeacher
				+ ", qualities=" + qualities + ", prefects=" + prefects + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Vector<Student> getStudents() {
		return students;
	}
	public void setStudents(Vector<Student> students) {
		this.students = students;
	}
	public Professor getHeadTeacher() {
		return HeadTeacher;
	}
	public void setHeadTeacher(Professor headTeacher) {
		HeadTeacher = headTeacher;
	}
	public ArrayList<String> getQualities() {
		return qualities;
	}
	public void setQualities(ArrayList<String> qualities) {
		this.qualities = qualities;
	}
	public Map<Integer, Student> getPrefects() {
		return prefects;
	}
	public void setPrefects(Map<Integer, Student> prefects) {
		this.prefects = prefects;
	}
}