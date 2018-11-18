package database;

public class Datas {
	
	public static void printData() {
		fillTheData();
		for (int i = 0; i < Fields.fields.size(); i++) {
			System.out.print("     ");
			System.out.print(Fields.fields.get(i));
			System.out.print(" | ");

		}
		System.out.println();
		for (int i = 0; i < CreateData.values.size(); i++) {
			System.out.print("ID:" + i + " ");
			System.out.print(CreateData.values.get(i));
			System.out.println();
		}
		System.out.println();

		Database.menu();
	}
	
	public static void fillTheData() {
		if (!(CreateData.values.isEmpty())) {
			CreateData.values.forEach((key, value) -> {
				if (!(value.size() == Fields.fieldscounter)) {
					do {
						value.add("-");
					} while (!(value.size() == Fields.fieldscounter));
				}
			});

		}

	}
}

