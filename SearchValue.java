import java.util.Scanner;

public class SearchValue {

	static Scanner input = new Scanner(System.in);

	public static void searchValue() {

		if(!CreateData.values.isEmpty()) {

			System.out.println("Give me the value you want to find:");
			String value = input.next();
			boolean boo = false;

			for(int i = 0; i < CreateData.values.size(); i++) {
				for(int j = 0; j < CreateData.values.get(Integer.toString(i)).size(); j++) {
					if((CreateData.values.get(Integer.toString(i)).get(j)).equals(value)) {
						boo = true;
						String  id = Integer.toString(i);
						System.out.println("ID:" + id + " and values are: " + CreateData.values.get(Integer.toString(i)));
						System.out.println();
					}
				}
			}
		}
		System.out.println();
		Database.menu();
	}
}
