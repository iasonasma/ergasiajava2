package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * class changeData.
 */
public class ChangeData {

    /**
     * the user can change data by id.
     */
    public static void changeData() {
        Scanner input = new Scanner(System.in);
        if (!CreateData.getValues().isEmpty()) {
            System.out.println("Give me the ID of the form you want to change: ");
            try {

                int form = input.nextInt();
                int done = 0;

                for (int i = 0; i < CreateData.getValues().size(); i++) {
                    if (i == form) {
                        done = 1;
                    }
                }
                if (done == 1) {
                    System.out.println("Which field do you want to change?");
                    int index = 0;
                    String formfield = input.next();
                    int flag = 0;
                    for (int j = 0; j < Fields.getFields().size(); j++) {
                        if (Fields.getFields().get(j).equals(formfield)) {
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Give me the new value: ");

                        String newvalue = input.next();
                        for (int i = 0; i < Fields.getFields().size(); i++) {
                            if ((Fields.getFields().get(i).equals(formfield))) {
                                index = i;
                            }
                        }

                        List<String> test = new ArrayList<String>();
                        test.addAll(CreateData.getValues().get(form));
                        test.set(index, newvalue);
                        System.out.println(test);
                        CreateData.getValues().put(form, test);
                        System.out.println("Changes done");
                    } else {
                        System.out.println("The field "
                                + formfield + " does not exist.");
                    }
                } else {
                    System.out.println("ID doesn't exist.");
                }
            } catch (InputMismatchException e) {
                System.out.println("You need to enter an integer.");
            }
        } else {
            System.out.println("The database is empty "
                    + "- no data available for changes");
        }

        Database.menu();

    }

}

