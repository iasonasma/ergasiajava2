package database;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteDataTst extends DeleteData {

	@Test
	public void testIddelete() {
		
		Integer idTest = 0;
		int size =  CreateData.getValues().size();
		CreateData.getValues().replace(idTest,  CreateData.getValues().get(idTest),  CreateData.getValues().get(idTest + 1));
	}
	
}
