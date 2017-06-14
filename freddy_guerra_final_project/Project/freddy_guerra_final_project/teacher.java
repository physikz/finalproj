package freddy_guerra_final_project;

public class teacher
{

	//fields
	private String first_name;
	private String last_name;
	private String person_address;
	private int phone_number;
	
	//sets
	public void set_first_name(String fname)
	{
		first_name = fname;
	}
	
	public void set_last_name(String lname)
	{
		last_name = lname;
	}
	
	public void set_person_address(String address)
	{
		person_address = address;
	}
	
	public void set_phone_number(int pnumber)
	{
		phone_number = pnumber;
	}
	
	//gets
	public String get_first_name()
	{
		return first_name;
	}
	
	public String get_last_name()
	{
		return last_name;
	}
	
	public String get_person_address()
	{
		return person_address;
	}
	
	public int get_phone_number()
	{
		return phone_number;
	}
}
