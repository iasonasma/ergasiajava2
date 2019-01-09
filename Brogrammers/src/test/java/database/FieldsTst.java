package database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FieldsTst extends Fields {

	@Test
	public void test() {
		ArrayList<String> fields = new ArrayList<String>();
		fields.add("amka");
		fields.add("thlefono");
		getFields();
		System.out.println(fields);
	}

}
