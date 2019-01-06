package database;

import java.util.Scanner;
/**
 * class search values.
 * */
public class SearchValue {

  /**
   * searching values.
   * */

    public static void searchValue() {
        Scanner input = new Scanner(System.in);
        if (!CreateData.getValues().isEmpty()) {

            System.out.println("Give me the value you want to find:");
            String value = input.next();

            for (int i = 0; i < CreateData.getValues().size(); i++) {
                for (int j = 0; j < CreateData.getValues().get(i).size(); j++) {
                    if ((CreateData.getValues().get(i).get(j)).equals(value)) {
                        System.out.println("ID:" + i + " and values are: "
                                + CreateData.getValues().get(i));
                        System.out.println();
                    } else {
                    	System.out.println("The value " +value+ " does not exist.");
                    }
                }
            }
        }
        System.out.println();
        Database.menu();
    }
}
