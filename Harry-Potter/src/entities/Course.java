package entities;

import java.util.Vector;

public class Course 
{
	private String name;
	private Professor professorName;
	private Vector<Student> studentNames;
	private Grade minGrade;
	private int year;

	// Constructors
	
	
	
	public Course(String _name)
	{	
		name = _name;
		professorName = null;
		minGrade = Grade.O;
		year = 1996;
		studentNames = null;
	}
	
	public Course()
	{	
		this(null);
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", professorName=" + professorName.getName() + ", minGrade=" + minGrade + ", year=" + year + "]";
	}

	public Course(String _name, Professor _professorName, Grade _minGrade, int _year)
	{	
		name = _name;
		professorName = _professorName;
		minGrade = _minGrade;
		year = _year;
		studentNames = null;
	}

	//Setters and getters
	
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public Professor getProfessorName() {
		return professorName;
	}

	public void setProfessorName(Professor _professorName) {
		professorName = _professorName;
	}

	public Vector<Student> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(Vector<Student> _studentNames) {
		studentNames = _studentNames;
	}

	public Grade getMinGrade() {
		return minGrade;
	}

	public void setMinGrade(Grade _minGrade) {
		minGrade = _minGrade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int _year) {
		year = _year;
	}
	

	
}
