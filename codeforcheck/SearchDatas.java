import java.util.Scanner;

public class SearchDatas {

	static Scanner input = new Scanner(System.in);

	public static void searchDatas() {

		if (!CreateData.values.isEmpty()) {

			System.out.println("Give me the ID of the form you want to find:");
			String id = input.next();

			for(int i = 0; i < CreateData.values.size(); i++) {
				if(Integer.toString(i).equals(id)) {
					System.out.println("The value is:" + CreateData.values.get(Integer.toString(i)));
				}
			}
		}
	Database.menu();
	}
}
