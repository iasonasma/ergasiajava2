package database;

/**
 * class Datas.
 * provides the methods the user can use
 * to fill and print the existing deatas.
 */
public class Datas {
    /**
     * prints the existing datas.
     */
    static void printData() {
        if (!Fields.getFields().isEmpty()) {
        fillTheData();
        for (int i = 0; i < Fields.getFields().size(); i++) {
            System.out.print("     ");
            System.out.print(Fields.getFields().get(i));
            System.out.print(" | ");

        }
        System.out.println();
        CreateData.getValues().forEach((key, value) -> {
            System.out.print("ID:" + key + "->");
            System.out.print(value);
            System.out.println();
        });
        System.out.println();
        } else {
            System.out.println("Empty database");
        }

        Database.menu();
    }

    /**
     * fills the data.
     */

    protected static void fillTheData() {
        if (!(CreateData.getValues().isEmpty())) {
            CreateData.getValues().forEach((key, value) -> {
                if (!(value.size() == Fields.getFieldscounter())) {
                    do {
                        value.add("-");
                    } while (!(value.size() == Fields.getFieldscounter()));
                }
            });

        }

    }
}

