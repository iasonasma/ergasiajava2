

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ChangeData {
	static Scanner input = new Scanner(System.in);

	public static void changeData() {
		if (!CreateData.values.isEmpty()) {
			System.out.println("Give me the ID of the form you want to change: ");
			try {

				String form = input.next();
				int done = 0;

				//for (int i = 0; i < CreateData.values.size(); i++) {
					if (CreateData.values.containsKey(form)) {
						done = 1;
					}
				//}
				if (done == 1) {
					System.out.println("Which field do you want to change?");
					int index = 0;
					String formfield = input.next();
					int flag = 0;
					for (int j = 0; j < Fields.fields.size(); j++) {
						if (Fields.fields.get(j).equals(formfield)) {
							flag = 1;
						}
					}
					if (flag == 1) {
						System.out.println("Give me the new value: ");

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
					} else {
						System.out.println("The field " + formfield + " does not exist.");
					}
				} else {
					System.out.println("ID doesn't exist.");
				}
			} catch (InputMismatchException e) {
				System.out.println("You need to enter an integer.");
			}
		} else {
			System.out.println("The database is empty - no data available for changes");
		}

		Database.menu();

	}

}
