import java.util.Scanner;

public class SearchDatas {

	static Scanner input = new Scanner(System.in);
	
	public static void searchDatas() {

		if (!CreateData.values.isEmpty()) {
    
			System.out.println("Give me the ID of the form you want to find:");
			int id = input.nextInt();
			
			for(int i = 0; i < CreateData.values.size(); i++) {
				if(i == id) {
					System.out.print("The value is:" + CreateData.values.get(i));
				}
			}
			System.out.println();
		}
	System.out.println();
	Database.menu();
	}
}

