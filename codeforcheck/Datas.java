

public class Datas {

	public static void printData() {
		fillTheData();
		for (int i = 0; i < Fields.fields.size(); i++) {
			System.out.print("     ");
			System.out.print(Fields.fields.get(i));
			System.out.print(" | ");

		}
		System.out.println();
	        CreateData.values.forEach((key,value) -> {
		System.out.print("ID:" + key + "->");
		System.out.print(value);
		System.out.println();
                });
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

