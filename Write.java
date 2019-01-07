package database;



import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * loads and writes database.
 * */
public class Write {
    /**
     * load database from a text file.
     **/
     static Scanner input = new Scanner(System.in);
    public static void writes() {

	System.out.println("Give me the file name of the database");
        try {

			String fileinput = input.next();
			if(fileinput.equals("cancel"))
			{
				return;
			}
			File f = new File(fileinput + ".txt");
            BufferedReader sc = new BufferedReader(new FileReader(fileinput + ".txt"));
			if(!(f.exists()))
			{
				throw new Exception();
			}
            String line;
            while ((line = sc.readLine()) != null) {
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

 	  System.out.println("Loaded!");	
        } catch (Exception e) {
			System.out.println("File cannot be found.If you want to stop, type cancel");
			writes();

        }

    }

    /**
     * writes/copy database into a text file.
     **/
    public static void writedata() {
        try {
			System.out.println("Give me the name of the file you wanna to save it");
			String files = input.next();
            PrintWriter pr = new PrintWriter(new File((files + ".txt")));
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
            System.out.println("File saved!");
            pr.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        Database.menu();
    }
}
