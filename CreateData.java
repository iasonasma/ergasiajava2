package database;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * the user can add datas in the fields.
 */
public class CreateData {

    /**
     * private variables with accessor methods.
     * */
    private static HashMap<Integer, List<String>> values
            = new HashMap<Integer, List<String>>();

    private static int counter = 0;

    /**
     * creates Data.
     */

    public  static void createData() {


        Scanner input = new Scanner(System.in);
        Datas.fillTheData();
        int n = Fields.getFields().size();
        int i = 0;
        List<String> valuedata = new ArrayList<String>();
        if (!Fields.getFields().isEmpty()) {

            while (i < n) {
                System.out.println("Give me value for : "
                        + Fields.getFields().get(i));
                String data = input.next();
                valuedata.add(data);
                i++;
            }


            values.put(counter, valuedata);
            counter++;
        } else {
            System.out.println("There are no fields in order to add data");
        }
        Database.menu();
    }

    /**
     * the values in a hashmap.
     * @return values.
     */
    public static HashMap<Integer, List<String>> getValues() {
        return values;
    }

    /**
     * setter for values.
     * @param values
     **/

    public  void setValues(HashMap<Integer, List<String>> values) {

         CreateData.values = values;
    }
    /**
    * accessor methods for variable counter.
    **/
    public static int getCounter() {
        return counter;
    }
    /**
     * setter for counter.
     * @param counter
     **/
    public static void setCounter(int counter) {
        CreateData.counter = counter;
    }
}
