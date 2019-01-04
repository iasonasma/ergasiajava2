import java.util.Scanner;
public class ChangeID{

	public static void changeid()
	{
		Scanner inpu = new Scanner(System.in);
		System.out.println("Give me the ID you wanna change");
		int id = inpu.nextInt();
		System.out.println("Give me the name of your primary key");
		String name = inpu.next();
		CreateData.values.put(name,CreateData.values.remove(String.valueOf(id)));






	}




}