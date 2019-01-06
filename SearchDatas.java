package database;

import java.util.Scanner;
/**
 *class search data.
 * */
public class SearchDatas {
    /**
     * search data by id.
     * */
    protected static void searchDatas() {

        if (!CreateData.getValues().isEmpty()) {
             Scanner input = new Scanner(System.in);

            System.out.println("Give me the ID of the form you want to find:");
            int id = input.nextInt();

            for (int i = 0; i < CreateData.getValues().size(); i++) {
                if (i == id) {
                    System.out.println("The value is:"
                            + CreateData.getValues().get(i));
                }
            }
        }
        Database.menu();
    }
}
