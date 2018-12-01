package database;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Database {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		try {
			System.out.println("--** Welcome **--");
			System.out.println("  ** Menu ** ");
			System.out.println("1. Set a field");
			System.out.println("2. Set data ");
			System.out.println("3. Print data");
			System.out.println("4. Delete data");
			System.out.print("5. Change data");
			System.out.println();

			Scanner input = new Scanner(System.in);

			int choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				Fields.createField();

			} else if (choice == 2) {
				CreateData.createData();

			} else if (choice == 3) {
				Datas.printData();

			} else if (choice == 4) {
				DeleteData.deleteData();
			} else if (choice == 5) {
				ChangeData.changeData();

			} else {
				System.out.println("Wrong choice.Please try again");
				menu();
			}
		} catch (InputMismatchException e) {
			System.err.println("Please insert an integer: ");
			
		}
		menu();

	}
}
