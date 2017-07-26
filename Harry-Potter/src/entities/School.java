package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<String> houseNames;
	private Vector<String> studentNames;
	private Vector<String> professorNames;
	private ArrayList<String> courseNames;
	
	// Constructors
	
	public School(String _name)
	{	
		name = _name;
		numOfStudents = 0;
		housed = false;
		houseNames = new ArrayList<String>();
		studentNames = new Vector<String>();
		professorNames = new Vector<String>();
		courseNames = new ArrayList<String>();
	}
	
	public School(String _name, ArrayList<String> _houseNames, ArrayList<String> _courseNames, 
			ArrayList<String> years, Vector<String> _studentNames, Vector<String> _professorNames)
	{	
		name = _name;
		houseNames = _houseNames;
		studentNames = _studentNames;
		professorNames = _professorNames;
		courseNames = _courseNames;
		if (studentNames != null)
			numOfStudents = studentNames.size();
		else
			numOfStudents = 0;
		if (houseNames == null || houseNames.isEmpty())
			housed = false;
		else
			housed = true;
	}
	
	// Getters
	
	public String getName()
	{
		return name;
	}
	public int getNumOfStudents()
	{
		return numOfStudents;
	}
	public boolean getHoused()
	{
		return housed;
	}
	public ArrayList<String> getCourseNames()
	{
		return courseNames;
	}
	public ArrayList<String> getHouseNames()
	{
		return houseNames;
	}
	public Vector<String> getStudentNames()
	{
		return studentNames;
	}
	public Vector<String> getProfessorNames()
	{
		return professorNames;
	}
	
	
	// Setters
	
	public void setName(String _name)
	{
		name = _name;
	}
	public void setNumOfStudents(int _numOfStudents)
	{
		numOfStudents = _numOfStudents;
	}
	public void setHoused(boolean _housed)
	{
		housed = _housed;
	}
	public void setCourseNames(ArrayList<String> _courseNames)
	{
		courseNames = _courseNames;
	}
	public void setHouseNames(ArrayList<String> _houseNames)
	{
		houseNames = _houseNames;
	}
	public void setStudentNames(Vector<String> _studentNames)
	{
		studentNames = _studentNames;
	}
	public void setProfessorNames(Vector<String> _professorNames)
	{
		professorNames = _professorNames;
	}
	
}
