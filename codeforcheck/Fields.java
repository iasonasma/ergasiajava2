

import java.util.ArrayList;
import java.util.Scanner;

public class Fields {
	static String field_name;
	public static Scanner input = new Scanner(System.in);
	protected static int fieldscounter;
	protected static ArrayList<String> fields = new ArrayList<String>();

	public static void createField() {

		System.out.println("Give me fields,if you want to stop press 0");
		field_name = input.next();
		while (!"0".equals(field_name)) {
			fields.add(field_name);
			fieldscounter++;
			System.out.println("Give me fields,if you want to stop press 0");
			field_name = input.next();

		}
		System.out.println(fields);
		fieldscounter = fields.size();
		Datas.fillTheData();
		Database.menu();
	}

}
