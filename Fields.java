package database;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fields class gets the name of the field that the user wants to create.
 */

public class Fields {
/**
 * private variables.
 * */
    private static ArrayList<String> fields = new ArrayList<String>();
    private static  String field_name;
    private static int fieldscounter;



    /**
     * creates fields.
     */
    static void createField() {
        Scanner input = new Scanner(System.in);

        System.out.println("Give me fields,if you want to stop press 0");
        setField_name(input.next());
        while (!"0".equals(getField_name())) {
            getFields().add(getField_name());
            setFieldscounter(getFieldscounter() + 1);
            System.out.println("Give me fields,if you want to stop press 0");
            setField_name(input.next());

        }
        System.out.println(getFields());
        setFieldscounter(getFields().size());
        Datas.fillTheData();
        Database.menu();
    }
    /**
     * accessors.
     *getters/setters for private variables
     */
    public static ArrayList<String> getFields() {
        return fields;
    }

    public static void setFields(ArrayList<String> fields) {
        Fields.fields = fields;
    }

    public static String getField_name() {
        return field_name;
    }

    public static void setField_name(String field_name) {
        Fields.field_name = field_name;
    }

    public static int getFieldscounter() {
        return fieldscounter;
    }

    public static void setFieldscounter(int fieldscounter) {
        Fields.fieldscounter = fieldscounter;
    }
}


