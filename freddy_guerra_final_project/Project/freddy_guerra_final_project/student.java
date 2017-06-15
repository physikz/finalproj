package freddy_guerra_final_project;

public class student extends teacher
{
	//fields
	private String emergency_contact;
	
	//sets
	public void set_emergency_contact(String econtact)
	{
		emergency_contact = econtact;
	}
	
	//gets
	public String get_emergency_contact()
	{
		return emergency_contact;
	}
}
