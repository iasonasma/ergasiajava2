

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class CreateData {
	public static Scanner input = new Scanner(System.in);
	public static int counter = 0;
	public static String primarykey;

	public static HashMap<String, List<String>> values = new HashMap<String, List<String>>();
	static String value;
	static List<String> valuedata = new ArrayList<String>();

	public static void createData() {

		Datas.fillTheData();
		int n = Fields.fields.size();
		int i = 0;
		List<String> valuedata = new ArrayList<String>();
		if (!Fields.fields.isEmpty()) {



			while (i < n) {
				System.out.println("Give me value for : " + Fields.fields.get(i));
				String data = input.next();
				valuedata.add(data);
				i++;
			}
			primarykey = String.valueOf(counter);
			values.put(primarykey, valuedata);
			counter++;
		} else {
			System.out.println("There are no fields in order to add data");
		}
		Database.menu();
	}

}
