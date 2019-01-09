package database;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CreateDataTest extends CreateData {
	
	
	List<String> valuedata = new ArrayList<String>();
	@Test
	public void createTest() {
		int counter = 0;
		try {
		String dataTestthl = "67899999";
		valuedata.add(dataTestthl);
		values.put(counter, valuedata);
		counter++;
		} catch (Exception e){
		}
	}

}