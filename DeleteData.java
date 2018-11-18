package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteData {
	static Scanner input = new Scanner(System.in);

	public static void deleteData() {
		System.out.println("Do you want to delete an ID or just a field? ");
		String choice = input.next();
		if (choice.equals("ID")) {
			System.out.println("Give the value of the ID you want to delete: ");
			Integer id = input.nextInt();
			List<String> name = CreateData.values.remove(id);
			
			// check if we are able to remove the key
			if(name==null){
				System.out.println("Id:"+id+" not found");
			}
			else{
				System.out.println("\nRemoving id:" + id + ","
						+ name);
			}
			
			System.out.println("ID deleted.");
		} else {
			System.out.println("Give me the ID of the form you want to delete: ");
			int delete = input.nextInt();
			System.out.println("Which field do you want to delete? ");
			int index = 0;
			String deletefield = input.next();
			for (int i = 0; i < Fields.fields.size(); i++) {
				if ((Fields.fields.get(i).equals(deletefield))) {
					index = i;
				}
			}
			List<String> test = new ArrayList<String>();
			test.addAll(CreateData.values.get(delete));
			test.set(index, "-");
			CreateData.values.put(delete, test);
			System.out.println("Field deleted");
		}

		Database.menu();
	}
}
