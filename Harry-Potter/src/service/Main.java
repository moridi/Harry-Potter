package service;

import java.util.Scanner;
import entities.*;

public class Main {
	public static void main(String[] args){
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
			switch(n){
				case(1):
				{
					break;
				}
				case(2):
				{
					break;
				}
				case(3):
				{
					break;
				}
				case(4):
				{
					break;
				}
				case(5):
				{
					break;
				}
				case(6):
				{
					break;
				}
				default:
					break;
			}
		}
	}
}
