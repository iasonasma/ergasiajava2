import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Database {

	public static void main(String[] args) {

	}

	public static void addToList(String name, LinkedList<HashMap> list, ArrayList<String> listData) {
		HashMap<String, ArrayList<String>> newList = new HashMap<String, ArrayList<String>>();
		list.add(newList);
		newList.put(name, listData);
	}

	public static void menu() {
		System.out.println("Welcome");
		System.out.println("** 	Menu  **");
		System.out.println("1. Set a field"); // Field
		System.out.println("2. Set data ");	   //takeData
		System.out.println("3.  Print data"); //showData
		System.out.println("4.  Delete data");//deleteData
		System.out.print("5.  Change data"); // changeData

		Scanner input = new Scanner(System.in);
		LinkedList<HashMap> list = new LinkedList<HashMap>();
		ArrayList<String> listData = new ArrayList<String>();

		int choice = input.nextInt();
		input.nextLine();

		if (choice == 1) {
			System.out.println("Please give the name of the field:");
			String name = input.next();
			Database.addToList(name, list, listData);


		} else if (choice == 2) {

		} else if (choice == 3) {

		} else if (choice == 4) {

		} else if (choice == 5) {

		}
	}
}

