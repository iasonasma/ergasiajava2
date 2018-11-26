package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteData {
	static Scanner input = new Scanner(System.in);

	public static void deleteData() {
		System.out.println("Do you want to delete an ID or just a field? ");
		String choice = input.next();
		if ((choice.equals("ID")) || (choice.equals("id"))) {
			deleteId();
		} else if (choice.equals("field")) {
			deleteField();
		} else {
			System.out.println("Please try again ");
			deleteData();

		}

	}

	public static void deleteId() {
		System.out.println("Give the value of the ID you want to delete: ");
		Integer id = input.nextInt();
		int done = 0;
		int size = CreateData.values.size();
		for (int i = 0; i < CreateData.values.size(); i++) {
			if (i == id) {
				done = 1;
			}
		}
		if (done == 1) {
			for (int i=id; i < CreateData.values.size() - 1; i++){
			CreateData.values.replace(i,CreateData.values.get(i),CreateData.values.get(i+1));
			}
			CreateData.values.remove(size -1 );
			System.out.println("ID deleted.");
			Database.menu();
		} else {
			System.out.println("The id doesn't exist.Please try again");
			deleteId();
		}

	}


	public static void deleteField() {
		System.out.println("Give me the ID of the form you want to delete: ");
		int delete = input.nextInt();
		int i = 0 ;
		System.out.println("Which field do you want to delete? ");
		int index = 0;
		String deletefield = input.next();
		      for (Iterator<String> iterator = Fields.fields.iterator(); iterator.hasNext();) {
				String num = iterator.next();
				if ((Fields.fields.get(i).equals(deletefield))) {
					index = i;
				}
				i++;
			}
		if (index == 0) {
			System.out.println("Wrong field name.Please try again");
			deleteField();
		}

		List<String> test = new ArrayList<String>();
		test.addAll(CreateData.values.get(delete));
		test.set(index, "-");
		CreateData.values.put(delete, test);
		System.out.println("Field deleted");
		Database.menu();

	}

}
