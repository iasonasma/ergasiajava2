package database;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Database {
	public static Scanner input = new Scanner(System.in);
	public static ArrayList<Field> alist=new ArrayList<Field>();
	
	public static void main(String[] args) {

	}

	public static void menu() {
		System.out.println("Welcome");
		System.out.println("** 	Menu  **"); 
		System.out.println("1. Set a field"); // Field
		System.out.println("2. Set data ");	   //takeData
		System.out.println("3. Print data"); //showData
		System.out.println("4. Delete data");//deleteData
		System.out.println("5. Change data"); // changeData
		

		int choice = input.nextInt();
		input.nextLine();

		if (choice == 1) {
			System.out.println("Please give the name of the field:");
			String name = input.next();	
			Field f = new Field(name); 
			alist.add(f);
			
			

		} else if (choice == 2) {

		} else if (choice == 3) {

		} else if (choice == 4) {

		} else if (choice == 5) {

		}
	}
}
