package database

public class Field {


	private String field_name;
	static protected int fcounter = 0;
	private int number_fields;

	protected  Field (String field_name) {
		fcounter++;
		number_fields = fcounter;

		this.field_name = field_name;

	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	@Override
	public String toString() {
		return "Field [field_name=" + field_name + "]";
	}


}

