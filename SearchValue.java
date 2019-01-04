import java.util.Scanner;

public class SearchValue {

	static Scanner input = new Scanner(System.in);

	public static void searchValue() {

		if(!CreateData.values.isEmpty()) {

			System.out.println("Give me the value you want to find:");
			String value = input.next();

			for(int i = 0; i < CreateData.values.size(); i++) {
				for(int j = 0; j < CreateData.values.get(i).size(); j++) {
					if(CreateData.values.get(i).get(j).equals(value)) {
						System.out.println("The value is here:" + CreateData.values.get(i));
						System.out.println();
					}
				}
			}
		}
		Database.menu();
	}
}
