package freddy_guerra_final_project;

import java.util.Scanner;
import java.util.ArrayList;

public class main_code
{
	
	static Scanner scan = new Scanner(System.in);
	
	static ArrayList<teacher> teachers = new ArrayList<teacher>();

	public static int display_main_menu()
	{//start...Main Menu
		//Displays Main Menu
		System.out.println("------------------Main Menu------------------");
		System.out.println("1. Add Student/Teacher");
		System.out.println("2. Remove Student/Teacher");
		System.out.println("3. Update Student/Teacher");
		System.out.println("4. Display all Students/Teachers Info");
		System.out.println("5. Display which teachers teach which grade");
		System.out.println("6. Display students in a certain grade");
		System.out.println("0. Exit");
		System.out.println("---------------------------------------------");
		System.out.println("Enter Selection");
		int main_menu_selection = scan.nextInt();
		scan.nextLine();
		
		System.out.println("");
		return main_menu_selection;
	}//end...Main Menu
	
	public static int main_menu_error_check(int x)
	{//start...Main Menu Error Check
		while (x < 0 || x > 6)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Main Menu Error Check
	
	public static void process_add_student_teacher()
	{
		int add_menu_selection;
		
		do
		{
			//Display Add Menu
			add_menu_selection = display_add_menu();
			//Error Check Add Menu
			add_menu_selection = add_menu_error_check(add_menu_selection);
			switch(add_menu_selection)
			{
			case 1: add_teacher();
				break;
			case 2: System.out.print("Remove Teacher");
				break;
			case 3: 
				break;
			}
			
		}
		
		while(add_menu_selection != 3);
		
	}
	
	public static int display_add_menu()
	{//start...Add Menu
		//Display Add Menu
		System.out.println("----------Adding Menu---------");
		System.out.println("1. Add Teacher");
		System.out.println("2. Add Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int add_selection = scan.nextInt();
		scan.nextLine();
		
		add_selection = add_menu_error_check(add_selection);
		
		System.out.println("");
		return add_selection;
	}//end...Add Menu
	
	public static int add_menu_error_check(int x)
	{//start...Add Menu Error Check
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Add Menu Error Check
	
	public static void add_teacher()
	{
		
		
		teacher prof = new teacher();
			
			prof.set_first_name(prompt_first_name());
			prof.set_last_name(prompt_last_name());
			prof.set_person_address(prompt_person_address());
			prof.set_person_city(prompt_person_city());
			prof.set_person_state(prompt_person_state());
			prof.set_person_zipcode(prompt_person_zipcode());
			prof.set_phone_number(prompt_phone_number());
			teachers.add(prof);
			System.out.println("");
			System.out.println(prof.get_first_name());
			
	}
	
	public static int display_remove_menu()
	{
		//Display Remove Menu
		System.out.println("----------Remove Menu---------");
		System.out.println("1. Remove Teacher");
		System.out.println("2. Remove Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int remove_selection = scan.nextInt();
		scan.nextLine();
		
		remove_selection = remove_menu_error_check(remove_selection);
		
		System.out.println("");
		return remove_selection;
	}
	
	public static int remove_menu_error_check(int x)
	{//start...Remove Menu Error Check
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Remove Menu Error Check
	
	public static int display_update_menu()
	{
		//Display Update Menu
		System.out.println("----------Update Menu---------");
		System.out.println("1. Update Teacher");
		System.out.println("2. Update Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int update_selection = scan.nextInt();
		scan.nextLine();
		
		update_selection = update_menu_error_check(update_selection);
		
		System.out.println("");
		return update_selection;
	}
	
	public static int update_menu_error_check(int x)
	{//start...Update Menu Error Check
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Update Menu Error Check
	
	public static void display_info()
	{
		
		System.out.println(teachers.get_first_name());
	}
	public static String prompt_first_name()
	{
		String x;
		System.out.print("First Name: ");
		x = scan.nextLine();
		return x;
	}

	public static String prompt_last_name()
	{
		String x;
		System.out.print("Last Name: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_address()
	{
		String x;
		System.out.print("Address: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_phone_number()
	{
		String x;
		System.out.print("Phone Number: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_city()
	{
		String x;
		System.out.print("City: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_state()
	{
		String x;
		System.out.print("State: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_zipcode()
	{
		String x;
		System.out.print("Zip Code: ");
		x = scan.nextLine();
		return x;
	}
	
	public static void main(String[] args)
	{
		//declarations
		int main_menu_selection;
		
		do
		{
			//Display Main Menu
			main_menu_selection = display_main_menu();
			//Error Check Main Menu
			main_menu_selection = main_menu_error_check(main_menu_selection);
			
			switch(main_menu_selection)
			{
			case 1: process_add_student_teacher();
				break;
			case 2: display_remove_menu();
				break;
			case 3: display_update_menu();
				break;
			case 4: display_info();
				break;
			case 5: System.out.println("Display which teachers teach which grade");
				break;
			case 6: System.out.println("Display students in a certain grade");
				break;
			case 0: System.out.println("Exiting Database");
				break;
				
			}
			
		}
		while (main_menu_selection != 0);
		
		System.out.println("Have a good day.");
		
		
		
		
		

	}

}
