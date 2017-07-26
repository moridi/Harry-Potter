package entities;

import java.util.Vector;

public class Course 
{
	private String name;
	private String professorName;
	private Vector<String> studentNames;
	private char minGrade;
	private int year;

	// Constructors
	
	public Course(String _name)
	{	
		name = _name;
		professorName = new String ("Unknown!");
		minGrade = 'O';
		year = 1996;
		studentNames = new Vector<String>();
	}
	
	public Course(String _name, String _professorName, char _minGrade, int _year)
	{	
		name = _name;
		professorName = _professorName;
		minGrade = _minGrade;
		year = _year;
		studentNames = new Vector<String>();
	}
	
	// Getters
	
	public String getName()
	{
		return name;
	}
	public String getProfessorName()
	{
		return professorName;
	}
	public char getMinGrade()
	{
		return minGrade;
	}
	public int getYear()
	{
		return year;
	}
	public Vector<String> getStudentNames()
	{
		return studentNames;
	}
	
	// Setters
	
	public void setName(String _name)
	{
		name = _name;
	}
	public void setProfessorName(String _professorName)
	{
		professorName = _professorName;
	}
	public void setMinGrade(char _minGrade)
	{
		minGrade = _minGrade;
	}
	public void setYear(int _year)
	{
		year = _year;
	}
	public void setStudentNames(Vector<String> _studentNames)
	{
		studentNames = _studentNames;
	}
	
}
