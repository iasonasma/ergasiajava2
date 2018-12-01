package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DeleteData {
	static Scanner input = new Scanner(System.in);

	public static void deleteData() {
		if (!CreateData.values.isEmpty()) {
			System.out.println("Do you want to delete an ID  a field or database? ");
			String choice = input.next();
			if ((choice.equals("ID")) || (choice.equals("id"))) {
				deleteId();
			} else if (choice.equals("field")) {
				deleteField();
			} else if (choice.equals("database")) {
				deleteDatabase();
			} else {
				System.out.println("Please try again ");
				deleteData();

			}
		} else {
			System.out.println("Empty Database - no data to delete.");
		}

	}

	public static void deleteId() {

		System.out.println("Give the value of the ID you want to delete: ");
		try {
			Integer id = input.nextInt();
			int done = 0;
			int size = CreateData.values.size();
			for (int i = 0; i < CreateData.values.size(); i++) {
				if (i == id) {
					done = 1;
				}
			}
			if (done == 1) {
				for (int i = id; i < CreateData.values.size() - 1; i++) {
					CreateData.values.replace(i, CreateData.values.get(i), CreateData.values.get(i + 1));
				}
				CreateData.values.remove(size - 1);
				CreateData.counter--;
				System.out.println("ID deleted.");
				Database.menu();
			} else {
				System.out.println("The id doesn't exist.Please try again");
				deleteId();
			}
		} catch (InputMismatchException e) {
			System.out.println("You need to enter an integer.");
		}

	}

	public static void deleteField() {
		System.out.println("Give me the ID of the form you want to delete: ");
		try {
			int delete = input.nextInt();
			int done = 0;
			for (int i = 0; i < CreateData.values.size(); i++) {
				if (i == delete) {
					done = 1;
				}
			}
			if (done == 1) {
				int i = 0;
				System.out.println("Which field do you want to delete? ");
				int index = -1;
				String deletefield = input.next();
				for (Iterator<String> iterator = Fields.fields.iterator(); iterator.hasNext();) {
					String num = iterator.next();
					if ((Fields.fields.get(i).equals(deletefield))) {
						index = i;
					}
					i++;
				}
				if (index == -1) {
					System.out.println("Wrong field name.Please try again");
					deleteField();
				}

				List<String> test = new ArrayList<String>();
				test.addAll(CreateData.values.get(delete));
				test.set(index, "-");
				CreateData.values.put(delete, test);
				System.out.println("Field deleted");
				Database.menu();
			} else {
				System.out.println("The ID you gave does not exist.");
			}
		} catch (InputMismatchException e) {
			System.out.println("You need to enter an integer.");
		}

	}

	public static void deleteDatabase() {
		CreateData.values.clear();
		System.out.println("The whole database is now deleted");
		System.out.println("The only thing left are your attribute names: ");
		Datas.printData();
		Database.menu();
	}

}
