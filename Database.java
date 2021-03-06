package database;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
/**
 * class Database.
 * provides the main method
 */
public class Database {


    static  Scanner input = new Scanner(System.in);


    /**
     * main method of databa2 se package.
     *
     * @param args
     */
	public static void main(String[] args) {
			menu();
	}


    /**
     * provides the menu.
     */
    public static void menu() {
        try {

            System.out.println("--** Welcome **--");
            System.out.println("  ** Menu ** ");
            System.out.println("1. Set a field");
            System.out.println("2. Set data ");
            System.out.println("3. Print data");
            System.out.println("4. Delete data");
            System.out.println("5. Change data");
            System.out.println("6. Search data");
            System.out.println("7. Search value");
            System.out.println("8. Load database");
            System.out.println("9. Save data");

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

            } else if (choice == 6) {
                SearchDatas.searchDatas();

            } else if (choice == 7) {
                SearchValue.searchValue();

            } else if (choice == 8) {
                Write.writes();
            } else if (choice == 9) {
            	Write.writedata();

            }else {
                System.out.println("Wrong choice.Please try again");
                menu();
            }
        } catch (InputMismatchException e) {
            System.err.println("Please insert an integer: ");
            input.next();
        }
        menu();

    }
}
