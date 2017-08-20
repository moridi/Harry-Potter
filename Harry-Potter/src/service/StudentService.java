package service;

import java.io.*;
import java.util.Vector;

import entities.*;

public class StudentService {
	private Student student;//The school the services are performed on/at
	private Vector<Student> allStudents; //All the students in the system
	
	public void getData(String fileName) throws IOException/* implement this method such that you will
	receive the file name (schoolDB.txt) as an input and inside the method you
	will open that file, read it and will fill up the information for each course (fill the
	vector)*/
	{
        FileReader freader = new FileReader(fileName);  
        BufferedReader br = new BufferedReader(freader);  
        String s;  
        while((s = br.readLine()) != null) {
        	if(s.equals("$")){
        		break;
        	}
        	String personName = s;
        	
        	String houseName = br.readLine();
        	House house = new House(houseName);
        	
        	String _bloodStatus = br.readLine();
        	BloodStatus bloodStatus = BloodStatus.valueOf(_bloodStatus);
        	
        	String schoolName = br.readLine();
        	School school = new School(schoolName);
        	
        	String birthday = br.readLine();
        	
           	String numberOfCourses = br.readLine();
        	int numOfCourses = Integer.parseInt(numberOfCourses);	
        	   	
        	Vector<Course> courses = new Vector<Course>();
        	
        	for(int i = 0; i < numOfCourses; i++){
        		String courseName = br.readLine();
        		courses.add(new Course(courseName));    		
        	}
        	
        	Student newStudent = new Student(personName, house, bloodStatus, school,  birthday, courses);
        	
        	allStudents.add(newStudent);
        		    
        	s = br.readLine();
        }  
        freader.close(); 
	}
	
	public StudentService(Student _student) {
		student = _student;
		allStudents = new Vector<Student>();
	}

	public void setData() throws FileNotFoundException, UnsupportedEncodingException/* implement this method so you can fill
	your database using the vector of courses you have */
	{
		PrintWriter writer = new PrintWriter("StudentDB.txt", "UTF-8");
		for(Student x: allStudents)
		{			
			writer.println(x.getName());
			writer.println(x.getHouseName().getName());
			writer.println(x.getBloodStatus().toString());
			writer.println(x.getSchool().getName());
			writer.println(x.getBirthday());
			writer.println(x.getCourses().size());
			
			for(Course course: x.getCourses()){
				writer.println(course.getName());
			}
			writer.println("*");
		}
		writer.println("$");
		writer.close();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student _student) {
		student = _student;
	}

	public Vector<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(Vector<Student> _allStudents) {
		allStudents = _allStudents;
	}

	public void sortToHouse(House house){
		Vector<Student> students = house.getStudents();
		students.add(student);
		house.setStudents(students);
	}
}
