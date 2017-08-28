package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import entities.*;

public class Main {
	public static int printChoices(){
		System.out.println("Which kind of actions do you like "
				+ "to shown:\n1- Create\n2- Edit\n3- Delete"
				+ "\n4- Search\n5- Show all");
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		
		return n;
	}
	
	public static String cin()
	{
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		return s;
	}
	
	public static Course getNewCourse(){
		System.out.println("Please enter course data:\nex:\n"
				+ "flying\nMadame Hooch\nO\n1996\n1\nHarry Potter");
		
		String courseName = cin();
		
		String professorName = cin();
		Professor prof = new Professor(professorName);
		
		String _minGrade = cin();
		Grade minGrade = Grade.valueOf(_minGrade);
		
		String _year = cin();
		int year = Integer.parseInt(_year); 
		
    	String numberOfStudents = cin();
    	int numOfStudents = Integer.parseInt(numberOfStudents);
    	
    	Vector<Student> students = new Vector<Student>();
    	
    	for(int i = 0; i < numOfStudents; i++){
    		String studentName = cin();
    		students.add(new Student(studentName));    		
    	}
    	
    	Course newCourse = new Course(courseName, prof, minGrade, year);
    	newCourse.setStudentNames(students);
    	
		return newCourse; 
	}
	

	public static House getNewHouse(){
		System.out.println("Please enter House data:\nex:\n"
				+ "Ravenclaw\nHogwarts\n2\nLuna Lovegood\nCho Chang");
		
		String houseName = cin();
		
		String schoolName = cin();
		School school = new School(schoolName);
		
    	String numberOfStudents = cin();
    	int numOfStudents = Integer.parseInt(numberOfStudents);
    	
    	Vector<Student> students = new Vector<Student>();
    	
    	for(int i = 0; i < numOfStudents; i++){
    		String studentName = cin();
    		students.add(new Student(studentName));    		
    	}
    	
    	House newHouse = new House(houseName, school, students);
		return newHouse; 
	}
	
	

	public static Person getNewPerson(){
		System.out.println("Please enter person data:\nex:\n"
				+ "Severus Snape\nSlytherin\nHalf_blood\nHogwarts\n09.01.1960");
		
    	String personName = cin();
    	
    	String houseName = cin();
    	House house = new House(houseName);
    	
    	String _bloodStatus = cin();
    	BloodStatus bloodStatus = BloodStatus.valueOf(_bloodStatus);
    	
    	String schoolName = cin();
    	School school = new School(schoolName);
    	
    	String birthday = cin();
    	
    	Person newPerson = new Person(personName, house, bloodStatus, school,  birthday);
    	
    	return newPerson;
	}
	
	public static Professor getNewProfessor(){
		System.out.println("Please enter professor data:\nex:\n"
				+ "Severus Snape\nSlytherin\nHalf_blood\nHogwarts"
				+ "\n09.01.1960\nPotions\n2000\nHe was the bravest man whom ever"
				+ " lived. A death eater spy. A.K.A. The Half Blood Prince");
		
    	String personName = cin();
    	
    	String houseName = cin();
    	House house = new House(houseName);
    	
    	String _bloodStatus = cin();
    	BloodStatus bloodStatus = BloodStatus.valueOf(_bloodStatus);
    	
    	String schoolName = cin();
    	School school = new School(schoolName);
    	
    	String birthday = cin();
    	
    	String courseName = cin();
    	Course course = new Course(courseName);
    	
    	String _intPart = cin();
    	int intPart = Integer.parseInt(_intPart);	
    	
    	String notes = cin();
    	
		Map<Integer, Course> courses = new HashMap<Integer, Course>();
		courses.put(intPart, course);

    	Professor newProfessor = new Professor(personName, house, bloodStatus, school,  birthday, courses, notes);
    	
    	return newProfessor;
	}
		

	public static School getNewSchool(){
		System.out.println("Please enter School data:\nex:\n"
				+ "Hogwarts\n4\nGryffindor\nHufflepuff\nRavenclaw"
				+ "\nSlytherin\n3\nNevile Longbottom\nLuna Lovegood"
				+ "\nLavender Brown\n2\nMinerva McGonagol\nSeverus Snape"
				+ "\n2\nFlying\nPotions\nEngland");
		
    	String shcoolName = cin();
    	
    	String numberOfHouses = cin();
    	int numOfHouses = Integer.parseInt(numberOfHouses);
    	
    	ArrayList<House> houses = new ArrayList<House>();
    	
    	for(int i = 0; i < numOfHouses; i++){
    		String houseName = cin();
    		houses.add(new House(houseName));    		
    	}
    	
    	String numberOfStudents = cin();
    	int numOfStudents = Integer.parseInt(numberOfStudents);
    	
    	Vector<Student> students = new Vector<Student>();
    	
    	for(int i = 0; i < numOfStudents; i++){
    		String studentName = cin();
    		students.add(new Student(studentName));    		
    	}
    	
    	String numberOfProfessors = cin();
    	int numOfProfessors = Integer.parseInt(numberOfProfessors);
    	
    	Vector<Professor> professors = new Vector<Professor>();
    	
    	for(int i = 0; i < numOfProfessors; i++){
    		String professorName = cin();
    		professors.add(new Professor(professorName));    		
    	}
    
    	String numberOfCourses = cin();
    	int numOfCourses = Integer.parseInt(numberOfCourses);
    	
    	ArrayList<Course> courses = new ArrayList<Course>();
    	
    	for(int i = 0; i < numOfCourses; i++){
    		String courseName = cin();
    		courses.add(new Course(courseName));    		
    	}
    	
    	String location = cin();
    	
    	School newSchool = new School(shcoolName, houses, courses, 
    			students, professors, location); 
    	return newSchool;
}

	public static Student getNewStudent(){
		System.out.println("Please enter student data:\nex:\n"
				+ "Harry Potter\nGryffindor\nPure_blood\nHogwarts"
				+ "\n01.07.1997\n6\nFlying\nCharms\nDefense Against"
				+ " the Dark Arts\nDivination\nHistory of Magic\nMuggle Studies");
    
		String personName = cin();
    	
    	String houseName = cin();
    	House house = new House(houseName);
    	
    	String _bloodStatus = cin();
    	BloodStatus bloodStatus = BloodStatus.valueOf(_bloodStatus);
    	
    	String schoolName = cin();
    	School school = new School(schoolName);
    	
    	String birthday = cin();
    	
       	String numberOfCourses = cin();
    	int numOfCourses = Integer.parseInt(numberOfCourses);	
    	   	
    	Vector<Course> courses = new Vector<Course>();
    	
    	for(int i = 0; i < numOfCourses; i++){
    		String courseName = cin();
    		courses.add(new Course(courseName));    		
    	}
    	
    	Student newStudent = new Student(personName, house, bloodStatus, school,  birthday, courses);
    	
    	return newStudent;
	}
		
	
	public static void doCourseAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			Course newCourse = getNewCourse();
			CourseService courseService = new CourseService(newCourse);
			courseService.createNewCourse(newCourse);
			System.out.println(newCourse.getName() + " added to courses and data base.");
			break;
			
		case(2):
			System.out.println("Please enter course name that you want to edit it:");
			String courseName = cin();
			Course newCourse1 = getNewCourse(); 
			CourseService courseService1 = new CourseService(newCourse1);
			Course courseWantToEdit = courseService1.searchByName(courseName);
			CourseService courseService2 = new CourseService(courseWantToEdit);
			courseService2.editCourse(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter course name that you want to delete it:");
			String courseName1 = cin();
			Course oldCourse = new Course(courseName1);
			CourseService courseService3 = new CourseService(oldCourse);
			courseService3.deleteCourse(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter course name that you want to shown:");
			String courseName4 = cin();
			CourseService courseService4 = new CourseService(new Course(courseName4));
			courseService4.showCourse(courseName4);
			break;
		
		case(5):
			CourseService courseService5 = new CourseService(new Course("flying"));
			courseService5.showAllCourses();
			break;
		
		default:
			break;
	}
		
}
	
	public static void doHouseAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			House newCourse = getNewHouse();
			HouseService courseService = new HouseService(newCourse);
			courseService.createNewHouse(newCourse);
			System.out.println(newCourse.getName() + " added to Houses and data base.");
			break;
			
		case(2):
			System.out.println("Please enter house name that you want to edit it:");
			String courseName = cin();
			House newCourse1 = getNewHouse(); 
			HouseService courseService1 = new HouseService(newCourse1);
			House courseWantToEdit = courseService1.searchByName(courseName);
			HouseService courseService2 = new HouseService(courseWantToEdit);
			courseService2.editHouse(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter House name that you want to delete it:");
			String courseName1 = cin();
			House oldCourse = new House(courseName1);
			HouseService courseService3 = new HouseService(oldCourse);
			courseService3.deleteHouse(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter House name that you want to shown:");
			String courseName4 = cin();
			HouseService courseService4 = new HouseService(new House(courseName4));
			courseService4.showHouse(courseName4);
			break;
		
		case(5):
			HouseService courseService5 = new HouseService(new House("Gryffindor"));
			courseService5.showAllHouses();
			break;
		
		default:
			break;
	}
		
}
	
	public static void doPersonAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			Person newCourse = getNewPerson();
			PersonService courseService = new PersonService(newCourse);
			courseService.createNewPerson(newCourse);
			System.out.println(newCourse.getName() + " added to Persons and data base.");
			break;
			
		case(2):
			System.out.println("Please enter Person name that you want to edit it:");
			String courseName = cin();
			Person newCourse1 = getNewPerson(); 
			PersonService courseService1 = new PersonService(newCourse1);
			Person courseWantToEdit = courseService1.searchByName(courseName);
			PersonService courseService2 = new PersonService(courseWantToEdit);
			courseService2.editPerson(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter Person name that you want to delete it:");
			String courseName1 = cin();
			Person oldCourse = new Person(courseName1);
			PersonService courseService3 = new PersonService(oldCourse);
			courseService3.deletePerson(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter Person name that you want to shown:");
			String courseName4 = cin();
			PersonService courseService4 = new PersonService(new Person(courseName4));
			courseService4.showPerson(courseName4);
			break;
		
		case(5):
			PersonService courseService5 = new PersonService(new Person("Harry Potter"));
			courseService5.showAllPersons();
			break;
		
		default:
			break;
	}
		
}

	public static void doProfessorAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			Professor newCourse = getNewProfessor();
			ProfessorService courseService = new ProfessorService(newCourse);
			courseService.createNewProfessor(newCourse);
			System.out.println(newCourse.getName() + " added to Professors and data base.");
			break;
			
		case(2):
			System.out.println("Please enter Professor name that you want to edit it:");
			String courseName = cin();
			Professor newCourse1 = getNewProfessor(); 
			ProfessorService courseService1 = new ProfessorService(newCourse1);
			Professor courseWantToEdit = courseService1.searchByName(courseName);
			ProfessorService courseService2 = new ProfessorService(courseWantToEdit);
			courseService2.editProfessor(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter Professor name that you want to delete it:");
			String courseName1 = cin();
			Professor oldCourse = new Professor(courseName1);
			ProfessorService courseService3 = new ProfessorService(oldCourse);
			courseService3.deleteProfessor(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter Professor name that you want to shown:");
			String courseName4 = cin();
			ProfessorService courseService4 = new ProfessorService(new Professor(courseName4));
			courseService4.showProfessor(courseName4);
			break;
		
		case(5):
			ProfessorService courseService5 = new ProfessorService(new Professor("Harry Potter"));
			courseService5.showAllProfessors();
			break;
		
		default:
			break;
	}
		
}
	
	public static void doSchoolAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			School newCourse = getNewSchool();
			SchoolService courseService = new SchoolService(newCourse);
			courseService.createNewSchool(newCourse);
			System.out.println(newCourse.getName() + " added to Schools and data base.");
			break;
			
		case(2):
			System.out.println("Please enter School name that you want to edit it:");
			String courseName = cin();
			School newCourse1 = getNewSchool(); 
			SchoolService courseService1 = new SchoolService(newCourse1);
			School courseWantToEdit = courseService1.searchByName(courseName);
			SchoolService courseService2 = new SchoolService(courseWantToEdit);
			courseService2.editSchool(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter School name that you want to delete it:");
			String courseName1 = cin();
			School oldCourse = new School(courseName1);
			SchoolService courseService3 = new SchoolService(oldCourse);
			courseService3.deleteSchool(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter School name that you want to shown:");
			String courseName4 = cin();
			SchoolService courseService4 = new SchoolService(new School(courseName4));
			courseService4.showSchool(courseName4);
			break;
		
		case(5):
			SchoolService courseService5 = new SchoolService(new School("Hogwarts"));
			courseService5.showAllSchools();
			break;
		
		default:
			break;
	}
		
}	
	
	public static void doStudentAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, show all
		
		switch(action){
		case(1):
			Student newCourse = getNewStudent();
			StudentService courseService = new StudentService(newCourse);
			courseService.createNewStudent(newCourse);
			System.out.println(newCourse.getName() + " added to Students and data base.");
			break;
			
		case(2):
			System.out.println("Please enter Student name that you want to edit it:");
			String courseName = cin();
			Student newCourse1 = getNewStudent(); 
			StudentService courseService1 = new StudentService(newCourse1);
			Student courseWantToEdit = courseService1.searchByName(courseName);
			StudentService courseService2 = new StudentService(courseWantToEdit);
			courseService2.editStudent(newCourse1);
			break;
		
		case(3):
			System.out.println("Please enter Student name that you want to delete it:");
			String courseName1 = cin();
			Student oldCourse = new Student(courseName1);
			StudentService courseService3 = new StudentService(oldCourse);
			courseService3.deleteStudent(oldCourse);
			break;
		
		case(4):
			System.out.println("Please enter Student name that you want to shown:");
			String courseName4 = cin();
			StudentService courseService4 = new StudentService(new Student(courseName4));
			courseService4.showStudent(courseName4);
			break;
		
		case(5):
			StudentService courseService5 = new StudentService(new Student("Hogwarts"));
			courseService5.showAllStudents();
			break;
		
		default:
			break;
	}
		
}	
	
	public static void main(String[] args) throws IOException{
		while(true)
		{
			System.out.println("\nHello!\nWhich kind of entities do you like "
				+ "to shown:\n1- Course\n2- House\n3- Person"
				+ "\n4- Professor\n5- School\n6- Student");
			
			Scanner reader = new Scanner(System.in);
			int n = reader.nextInt();
			
			if(n > 6 || n < 1)
			{
				System.out.println("Illegal input!Please choose other ones.");
				continue;
			}
			
			int action = printChoices();
			
			switch(n){
				case(1):
					doCourseAction(action);
					break;
					
				case(2):
					doHouseAction(action);
					break;
				
				case(3):
					doPersonAction(action);
					break;
				
				case(4):
					doProfessorAction(action);
					break;
				
				case(5):
					doSchoolAction(action);
					break;
				
				case(6):
					doStudentAction(action);
					break;
				
				default:
					break;
			}
		}
	}
}
