package freddy_guerra_final_project;

public class teacher
{

	//fields
	private String first_name;
	private String last_name;
	private String person_address;
	private String person_city;
	private String person_state;
	private String person_zipcode;
	private String phone_number;
	private String grade_teaches;
	private int birth_month;
	private int birth_day;
	private int birth_year;
	
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
	
	public void set_person_city(String city)
	{
		person_city = city;
	}
	
	public void set_person_state(String state)
	{
		person_state = state;
	}
	
	public void set_person_zipcode(String zcode)
	{
		person_zipcode = zcode;
	}
	
	public void set_phone_number(String pnumber)
	{
		phone_number = pnumber;
	}
	
	public void set_grade_teaches(String gteach)
	{
		grade_teaches = gteach;
	}
	
	public void set_birth_month(int bmonth)
	{
		birth_month = bmonth;
	}
	
	public void set_birth_day(int bday)
	{
		birth_day = bday;
	}
	
	public void set_birth_year(int byear)
	{
		birth_year = byear;
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
	
	public String get_person_city()
	{
		return person_city;
	}
	
	public String get_person_state()
	{
		return person_state;
	}
	
	public String get_person_zipcode()
	{
		return person_zipcode;
	}
	public String get_phone_number()
	{
		return phone_number;
	}
	
	public String get_grade_teaches()
	{
		return grade_teaches;
	}
	
	public int get_birth_month()
	{
		return birth_month;
	}
	
	public int get_birth_day()
	{
		return birth_day;
	}
	
	public int get_birth_year()
	{
		return birth_year;
	}
	
}
