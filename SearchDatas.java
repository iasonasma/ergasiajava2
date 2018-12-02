import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class SearchDatas {

	static Scanner input = new Scanner(System.in);
	public static HashMap<Integer, List<String>> values = new HashMap<Integer, List<String>>();
	
	public static void searchDatas() {

		if (!CreateData.values.isEmpty()) {
    
			System.out.println("Give me the ID of the form you want to find:");
			int id = input.nextInt();
			int find = 0;

			for(int i = 0; i < CreateData.values.size(); i++) {
				if(i == id) {
					find = 1;
					id = i;
					System.out.print("The value is:" + CreateData.values.get(i));
				}
			}
			System.out.println();
		}
	System.out.println();
	Database.menu();
	}
}

