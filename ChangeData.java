package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeData {
	static Scanner input = new Scanner(System.in);

	public static void changeData() {

		System.out.println("Give me the ID of the form you wanna change ");
		int form = input.nextInt();
		System.out.println("Which field you wanna change?");
		int index = 0;
		String formfield = input.next();
		System.out.println("Give me the new value");

		String newvalue = input.next();
		for (int i = 0; i < Fields.fields.size(); i++) {
			if ((Fields.fields.get(i).equals(formfield))) {
				index = i;
			}
		}

		List<String> test = new ArrayList<String>();
		test.addAll(CreateData.values.get(form));
		test.set(index, newvalue);
		System.out.println(test);
		CreateData.values.put(form, test);
		System.out.println("Changes done");

		Database.menu();
	}

}
