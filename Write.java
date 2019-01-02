import java.util.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;

public class Write{

	public static void writes(){
				            ArrayList<String> name = new ArrayList<String>();
				            String line = null;
				            String again = null;
try {

				            BufferedReader sc = new BufferedReader(new FileReader("datas.txt"));

				            while ((line = sc.readLine()) !=null) {
				                if (!line.trim().equals("")) {
									List<String> valuedata = new ArrayList<String>();

				                    if (line.toLowerCase().contains("fields")) {
										again = line.split("=")[1].trim();

										for(String retval: again.split(","))
										{

											Fields.fields.add(retval);
											Fields.fieldscounter++;

										}
									}
									else{

								again = line.split("=")[1].trim();
								for(String retval: again.split(","))
								{
								valuedata.add(retval);
								}
								CreateData.values.put(CreateData.counter,valuedata);
								CreateData.counter++;
}
				                }
				            }


						}catch(Exception e){};




	}

    public static void writedata() {
		try{
     		 PrintWriter pr = new PrintWriter(new File("datas.txt"));
     		 pr.print("fields=");
     		 for(int i = 0; i < Fields.fields.size();i++)
     		 {
	 		pr.print(Fields.fields.get(i) + ",");
			}
			pr.println();
	 		CreateData.values.forEach((key,value) -> {
			pr.print(key + "=");
			 for(int i = 0 ; i < value.size(); i++){

	 		 pr.print(value.get(i) + ",");
				 }

				 pr.println();
			 });
		      pr.close();
		  }catch(Exception e){System.err.println(e);};
		  Database.menu();
}
}
