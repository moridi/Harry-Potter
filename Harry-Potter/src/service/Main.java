package service;

import java.io.IOException;
import java.util.Scanner;
import entities.*;

public class Main {
	public static int printChoices(){
		System.out.println("Which kind of actions do you like "
				+ "to shown:\n1- Create\n2- Edit\n3- Delete"
				+ "\n4- Search\n5- Sort");
		
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
		System.out.println("Please enter course name:");
		
		String courseName = cin();

		return new Course(courseName);
	}
	
	public static void doCourseAction(int action) throws IOException{
		if(action > 5 || action < 1)
			return;
		
		//create, edit, delete, search, sort
		
		switch(action){
		case(1):
			Course newCourse = getNewCourse();
			CourseService courseService = new CourseService(newCourse);
			courseService.createNewCourse(newCourse);
			System.out.println(newCourse.getName() + " added to courses and data base.");
			break;
			
		case(2):
			break;
		
		case(3):
			break;
		
		case(4):
			break;
		
		case(5):
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
					break;
				
				case(3):
					break;
				
				case(4):
					break;
				
				case(5):
					break;
				
				case(6):
					break;
				
				default:
					break;
			}
		}
	}
}
