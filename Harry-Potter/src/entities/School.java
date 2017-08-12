package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<House> houseNames;
	private Vector<Student> studentNames;
	private Vector<Professor> professorNames;
	private ArrayList<Course> courseNames;
	private String location;
	
	// Constructors
	
	public School(String _name)
	{	
		name = _name;
		numOfStudents = 0;
		housed = false;
		houseNames = new ArrayList<House>();
		studentNames = new Vector<Student>();
		professorNames = new Vector<Professor>();
		courseNames = new ArrayList<Course>();
		location = "Unknown";
	}
	
	public School(String _name, ArrayList<House> _houseNames, ArrayList<Course> _courseNames, 
			ArrayList<String> years, Vector<Student> _studentNames, Vector<Professor> _professorNames, String loc)
	{	
		name = _name;
		houseNames = _houseNames;
		studentNames = _studentNames;
		professorNames = _professorNames;
		courseNames = _courseNames;
		
		location = loc;
		
		if (studentNames != null)
			numOfStudents = studentNames.size();
		else
			numOfStudents = 0;
		if (houseNames == null || houseNames.isEmpty())
			housed = false;
		else
			housed = true;
	}
	
	

	@Override
	public String toString() {
		return "School [name=" + name + ", numOfStudents=" + numOfStudents + ", housed=" + housed + ", houseNames="
				+ houseNames + ", studentNames=" + studentNames + ", professorNames=" + professorNames
				+ ", courseNames=" + courseNames + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public boolean isHoused() {
		return housed;
	}

	public void setHoused(boolean housed) {
		this.housed = housed;
	}

	public ArrayList<House> getHouseNames() {
		return houseNames;
	}

	public void setHouseNames(ArrayList<House> houseNames) {
		this.houseNames = houseNames;
	}

	public Vector<Student> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(Vector<Student> studentNames) {
		this.studentNames = studentNames;
	}

	public Vector<Professor> getProfessorNames() {
		return professorNames;
	}

	public void setProfessorNames(Vector<Professor> professorNames) {
		this.professorNames = professorNames;
	}

	public ArrayList<Course> getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(ArrayList<Course> courseNames) {
		this.courseNames = courseNames;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

	
}
