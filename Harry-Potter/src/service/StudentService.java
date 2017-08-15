package service;

import java.util.Vector;

import entities.*;

public class StudentService {
	private Student student;
	
	public StudentService(Student student) {
		this.student = student;
	}
	
	public void sortToHouse(House house){
		Vector<Student> students = house.getStudents();
		students.add(student);
		house.setStudents(students);
	}
}
