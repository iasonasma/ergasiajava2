package database;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * class search data.
 */
public class SearchDatas {
	/**
	 * search data by id.
	 */
	protected static void searchDatas() {

		if (!CreateData.getValues().isEmpty()) {
			Scanner input = new Scanner(System.in);

			System.out.println("Give me the ID of the form you want to find:");
			try {
				int id = input.nextInt();

				for (int i = 0; i < CreateData.getValues().size(); i++) {
					if (i == id) {
						System.out.println("The value is:" + CreateData.getValues().get(i));
					}
				}
			} catch (InputMismatchException e) {
				System.err.println("Please insert an integer. ");
				input.next();
			}
		}
		Database.menu();
	}
}
