package database;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * loads and writes database.
 * */
public class Write {
    /**
     * load database from a text file.
     **/
    public static void writes() {

        try {

            BufferedReader sc = new BufferedReader(new FileReader("datas.txt"));

            String line;
            while ((line = sc.readLine()) != null) {
                if (!line.trim().equals("")) {
                    List<String> valuedata = new ArrayList<String>();

                    String again;
                    if (line.toLowerCase().contains("fields")) {
                        again = line.split("=")[1].trim();

                        for (String retval : again.split(",")) {

                            Fields.getFields().add(retval);
                            Fields.setFieldscounter(Fields.getFieldscounter() + 1);

                        }
                    } else {

                        again = line.split("=")[1].trim();
                        for (String retval : again.split(",")) {
                            valuedata.add(retval);
                        }
                        CreateData.getValues().put(CreateData.getCounter(), valuedata);
                        CreateData.setCounter(CreateData.getCounter() + 1);
                    }
                }
            }


        } catch (Exception e) {
        }

    }

    /**
     * writes/copy database into a text file.
     **/
    public static void writedata() {
        try {
            PrintWriter pr = new PrintWriter(new File("datas.txt"));
            pr.print("fields=");
            for (int i = 0; i < Fields.getFields().size(); i++) {
                pr.print(Fields.getFields().get(i) + ",");
            }
            pr.println();
            CreateData.getValues().forEach((key, value) -> {
                pr.print(key + "=");
                for (int i = 0; i < value.size(); i++) {

                    pr.print(value.get(i) + ",");
                }

                pr.println();
            });
            pr.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        Database.menu();
    }
}
