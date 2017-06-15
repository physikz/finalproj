package freddy_guerra_final_project;

import java.util.Scanner;
import java.util.ArrayList;

public class main_code
{
	
	static Scanner scan = new Scanner(System.in);
	
	public static ArrayList<teacher> teachers = new ArrayList<teacher>();
	public static ArrayList<student> students = new ArrayList<student>();

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
			case 2: add_student();
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
		System.out.println("------------------Adding Menu----------------");
		System.out.println("1. Add Teacher");
		System.out.println("2. Add Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("---------------------------------------------");
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
		prof.set_person_gender(prompt_person_gender());
		prof.set_person_ethnicity(prompt_person_ethnicity());
		prof.set_person_age(prompt_person_age());
		prof.set_person_grade(prompt_person_grade());
		teachers.add(prof);
		System.out.println("");
			
	}
	
	public static void add_student()
	{
		student stud = new student();
		
		stud.set_first_name(prompt_first_name());
		stud.set_last_name(prompt_last_name());
		stud.set_person_address(prompt_person_address());
		stud.set_person_city(prompt_person_city());
		stud.set_person_state(prompt_person_state());
		stud.set_person_zipcode(prompt_person_zipcode());
		stud.set_phone_number(prompt_phone_number());
		stud.set_person_gender(prompt_person_gender());
		stud.set_person_ethnicity(prompt_person_ethnicity());
		stud.set_person_age(prompt_person_age());
		stud.set_person_grade(prompt_person_grade());
		stud.set_emergency_contact(prompt_emergency_contact());
		students.add(stud);
		System.out.println("");
	}
	
	public static void process_remove_student_teacher()
	{
		int remove_menu_selection;
		
		do
		{
			//Display Remove Menu
			remove_menu_selection = display_remove_menu();
			//Error Check Remove Menu
			remove_menu_selection = remove_menu_error_check(remove_menu_selection);
			switch(remove_menu_selection)
			{
			case 1: remove_teacher();
				break;
			case 2: remove_student();
				break;
			case 3: 
				break;
			}
			
		}
		
		while(remove_menu_selection != 3);
	}
	
	public static int display_remove_menu()
	{
		//Display Remove Menu
		System.out.println("-----------------Remove Menu-----------------");
		System.out.println("1. Remove Teacher");
		System.out.println("2. Remove Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("---------------------------------------------");
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
	
	public static void remove_teacher()
	{
		System.out.println("ID# of teacher being removed: ");
		int remove_teacherid = scan.nextInt();
		scan.nextLine();
		
		teachers.set(remove_teacherid, null);
	}
	
	public static void remove_student()
	{
		System.out.println("ID# of student being removed: ");
		int remove_studentid = scan.nextInt();
		scan.nextLine();
		
		students.set(remove_studentid, null);
	}

	public static void process_update_student_teacher()
	{
		int update_menu_selection;
		
		do
		{
			//Display Add Menu
			update_menu_selection = display_update_menu();
			//Error Check Add Menu
			update_menu_selection = update_menu_error_check(update_menu_selection);
			switch(update_menu_selection)
			{
			case 1: update_teacher();
				break;
			case 2: update_student();
				break;
			case 3: 
				break;
			}
			
		}
		
		while(update_menu_selection != 3);
	}

	public static int display_update_menu()
	{
		//Display Update Menu
		System.out.println("-----------------Update Menu-----------------");
		System.out.println("1. Update Teacher");
		System.out.println("2. Update Student");
		System.out.println("3. Back to Main Menu");
		System.out.println("---------------------------------------------");
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
	
	public static void update_teacher()
	{
		int update_teacher_field_selection;
		
		System.out.print("ID# of teacher being updated: ");
		int update_teacherid = scan.nextInt();
		scan.nextLine();
		
		do
		{
			//Display Update Teacher Menu
			update_teacher_field_selection = display_update_teacher_field();
			//Error Update Teacher Menu
			update_teacher_field_selection = update_teacher_field_menu_error_check(update_teacher_field_selection);
		
			switch(update_teacher_field_selection)
			{
			case 1 : 
				teacher the_teacher = teachers.get(update_teacherid);
				the_teacher.set_first_name(prompt_first_name());
				break;
			case 2 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_last_name(prompt_last_name());
				break;
			case 3 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_address(prompt_person_address());
				break;
			case 4 : 
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_city(prompt_person_city());
				break;
			case 5 : 
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_state(prompt_person_state());
				break;
			case 6 : 
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_zipcode(prompt_person_zipcode());
				break;
			case 7 : 
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_phone_number(prompt_phone_number());
				break;
			case 8 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_gender(prompt_person_gender());
				break;
			case 9 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_ethnicity(prompt_person_ethnicity());
				break;
			case 10 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_age(prompt_person_age());
				break;
			case 11 :
				the_teacher = teachers.get(update_teacherid);
				the_teacher.set_person_grade(prompt_person_grade());
				break;
			case 12 :
				break;
			}
			
		}
		while(update_teacher_field_selection != 12);
		
	}
	
	public static void update_student()
	{
		int update_student_field_selection;
		
		System.out.print("ID# of student being updated: ");
		int update_studentid = scan.nextInt();
		scan.nextLine();
		
		do
		{
			//Display Update Student Menu
			update_student_field_selection = display_update_student_field();
			//Error Update Student Menu
			update_student_field_selection = update_student_field_menu_error_check(update_student_field_selection);
		
			switch(update_student_field_selection)
			{
			case 1 : 
				student the_student = students.get(update_studentid);
				the_student.set_first_name(prompt_first_name());
				break;
			case 2 :
				the_student = students.get(update_studentid);
				the_student.set_last_name(prompt_last_name());
				break;
			case 3 :
				the_student = students.get(update_studentid);
				the_student.set_person_address(prompt_person_address());
				break;
			case 4 : 
				the_student = students.get(update_studentid);
				the_student.set_person_city(prompt_person_city());
				break;
			case 5 : 
				the_student = students.get(update_studentid);
				the_student.set_person_state(prompt_person_state());
				break;
			case 6 : 
				the_student = students.get(update_studentid);
				the_student.set_person_zipcode(prompt_person_zipcode());
				break;
			case 7 : 
				the_student = students.get(update_studentid);
				the_student.set_phone_number(prompt_phone_number());
				break;
			case 8 :
				the_student = students.get(update_studentid);
				the_student.set_person_gender(prompt_person_gender());
				break;
			case 9 :
				the_student = students.get(update_studentid);
				the_student.set_person_ethnicity(prompt_person_ethnicity());
				break;
			case 10 :
				the_student = students.get(update_studentid);
				the_student.set_person_age(prompt_person_age());
				break;
			case 11 :
				the_student = students.get(update_studentid);
				the_student.set_person_grade(prompt_person_grade());
				break;
			case 12 :
				the_student = students.get(update_studentid);
				the_student.set_emergency_contact(prompt_emergency_contact());
				break;
			case 13 :
				break;
			}
			
		}
		while(update_student_field_selection != 13);
		
	}
	
	public static int display_update_teacher_field()
	{
		//Display Update Teacher Field Menu
		System.out.println("----------Update Teacher Menu---------");
		System.out.println("1. First Name");
		System.out.println("2. Last Name");
		System.out.println("3. Street Address");
		System.out.println("4. City");
		System.out.println("5. State");
		System.out.println("6. Zip Code");
		System.out.println("7. Phone Number");
		System.out.println("8. Gender");
		System.out.println("9. Ethnicity");
		System.out.println("10. Age");
		System.out.println("11. Grade");
		System.out.println("12. Update a Different Teacher");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int update_teacher_field_selection = scan.nextInt();
		scan.nextLine();
		
		update_teacher_field_selection = update_teacher_field_menu_error_check(update_teacher_field_selection);
		
		System.out.println("");
		return update_teacher_field_selection;
	}
	
	public static int display_update_student_field()
	{
		//Display Update Student Field Menu
		System.out.println("----------Update Student Menu---------");
		System.out.println("1. First Name");
		System.out.println("2. Last Name");
		System.out.println("3. Street Address");
		System.out.println("4. City");
		System.out.println("5. State");
		System.out.println("6. Zip Code");
		System.out.println("7. Phone Number");
		System.out.println("8. Gender");
		System.out.println("9. Ethnicity");
		System.out.println("10. Age");
		System.out.println("11. Grade");
		System.out.println("12. Emergency Contact");
		System.out.println("13. Update a Different Teacher");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int update_student_field_selection = scan.nextInt();
		scan.nextLine();
		
		update_student_field_selection = update_student_field_menu_error_check(update_student_field_selection);
		
		System.out.println("");
		return update_student_field_selection;
	}
	
	public static int update_teacher_field_menu_error_check(int x)
	{//start...Update Menu Error Check
		while (x < 1 || x > 12)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Update Menu Error Check
	
	public static int update_student_field_menu_error_check(int x)
	{//start...Update Menu Error Check
		while (x < 1 || x > 13)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Update Menu Error Check
	
	public static void process_display_info()
	{
		int display_info_selection;
		
		do
		{
			//Display Info Menu
			display_info_selection = display_info_menu();
			//Error Check Info Menu
			display_info_selection = display_menu_error_check(display_info_selection);
			switch(display_info_selection)
			{
			case 1: display_teacher_info();
				break;
			case 2: display_student_info();
				break;
			case 3:
				break;
			}
			
		}
		
		while(display_info_selection != 3);
	}
	
	public static int display_info_menu()
	{//start...Display Info Menu
		//Display Info Menu
		System.out.println("----------Display Menu---------");
		System.out.println("1. Display All Teachers");
		System.out.println("2. Display All Students");
		System.out.println("3. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int display_selection = scan.nextInt();
		scan.nextLine();
		
		display_selection = display_menu_error_check(display_selection);
		
		System.out.println("");
		return display_selection;
	}//end...Display Info Menu
	
	public static int display_menu_error_check(int x)
	{//start...Display Menu Error Check
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
			scan.nextLine();
		}
		
		return x;
	}//end...Display Menu Error Check
	
	public static void display_teacher_info()
	{

		for(int j = 0; j < teachers.size(); j++)
		{
			 teacher a_teacher = teachers.get(j);
			if (a_teacher != null)
			{	
				System.out.println("First Name: \t" + teachers.get(j).get_first_name());
				System.out.println("Last Name: \t" + teachers.get(j).get_last_name());
				System.out.println("Address: \t" + teachers.get(j).get_person_address());
				System.out.println("\t\t" + teachers.get(j).get_person_city() + "," + teachers.get(j).get_person_state() + " " + teachers.get(j).get_person_zipcode());
				System.out.println("Phone Number: \t" + teachers.get(j).get_phone_number());
				System.out.println("Gender: \t" + teachers.get(j).get_person_gender());
				System.out.println("Ethnicity: \t" + teachers.get(j).get_person_ethnicity());
				System.out.println("Age: \t\t" + teachers.get(j).get_person_age());
				System.out.println("Grade: \t" + teachers.get(j).get_person_grade());
				System.out.println("Teacher ID#: \t" + j);
				System.out.println("");
			}	
		}
	}
	
	public static void display_student_info()
	{

		for(int j = 0; j < students.size(); j++)
		{
			 student a_student = students.get(j);
			if (a_student != null)
			{	
				System.out.println("First Name: \t\t" + students.get(j).get_first_name());
				System.out.println("Last Name: \t\t" + students.get(j).get_last_name());
				System.out.println("Address: \t\t" + students.get(j).get_person_address());
				System.out.println("\t\t\t" + students.get(j).get_person_city() + "," + students.get(j).get_person_state() + " " + students.get(j).get_person_zipcode());
				System.out.println("Phone Number: \t\t" + students.get(j).get_phone_number());
				System.out.println("Gender: \t\t" + students.get(j).get_person_gender());
				System.out.println("Ethnicity: \t\t" + students.get(j).get_person_ethnicity());
				System.out.println("Age: \t\t\t" + students.get(j).get_person_age());
				System.out.println("Grade: \t\t\t" + students.get(j).get_person_grade());
				System.out.println("Emergency Contact: \t" + students.get(j).get_emergency_contact());
				System.out.println("Student ID#: \t\t" + j);
				System.out.println("");
			}	
		}
	}
	
	public static void process_display_teachers_grade()
	{
		System.out.print("Teachers for which Grade: ");
		String grade_teachers = scan.nextLine();
		
		for (int k = 0; k < teachers.size(); k++)
		{
			if(grade_teachers.compareTo(teachers.get(k).get_person_grade()) == 0)
			{
				System.out.println("First Name: \t" + teachers.get(k).get_first_name());
				System.out.println("Last Name: \t" + teachers.get(k).get_last_name());
				System.out.println("Address: \t" + teachers.get(k).get_person_address());
				System.out.println("\t\t" + teachers.get(k).get_person_city() + "," + teachers.get(k).get_person_state() + " " + teachers.get(k).get_person_zipcode());
				System.out.println("Phone Number: \t" + teachers.get(k).get_phone_number());
				System.out.println("Gender: \t" + teachers.get(k).get_person_gender());
				System.out.println("Ethnicity: \t" + teachers.get(k).get_person_ethnicity());
				System.out.println("Age: \t\t" + teachers.get(k).get_person_age());
				System.out.println("Grade: \t" + teachers.get(k).get_person_grade());
				System.out.println("Teacher ID#: \t" + k);
				System.out.println("");
			}
		}
	}

	public static void process_display_students_grade()
	{
		System.out.print("Students for which Grade: ");
		String grade_students = scan.nextLine();
		
		for (int k = 0; k < students.size(); k++)
		{
			if(grade_students.compareTo(students.get(k).get_person_grade()) == 0)
			{
				System.out.println("First Name: \t\t" + students.get(k).get_first_name());
				System.out.println("Last Name: \t\t" + students.get(k).get_last_name());
				System.out.println("Address: \t\t" + students.get(k).get_person_address());
				System.out.println("\t\t\t" + students.get(k).get_person_city() + "," + students.get(k).get_person_state() + " " + students.get(k).get_person_zipcode());
				System.out.println("Phone Number: \t\t" + students.get(k).get_phone_number());
				System.out.println("Gender: \t\t" + students.get(k).get_person_gender());
				System.out.println("Ethnicity: \t\t" + students.get(k).get_person_ethnicity());
				System.out.println("Age: \t\t\t" + students.get(k).get_person_age());
				System.out.println("Grade: \t\t\t" + students.get(k).get_person_grade());
				System.out.println("Emergency Contact: \t" + students.get(k).get_emergency_contact());
				System.out.println("Student ID#: \t\t" + k);
				System.out.println("");
			}
		}
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
		System.out.print("Street Address: ");
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
	
	public static String prompt_phone_number()
	{
		String x;
		System.out.print("Phone Number: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_grade()
	{
		String x;
		System.out.print("Grade: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_gender()
	{
		String x;
		System.out.print("Gender: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_person_ethnicity()
	{
		String x;
		System.out.print("Ethnicity: ");
		x = scan.nextLine();
		return x;
	}
	
	public static String prompt_emergency_contact()
	{
		String x;
		System.out.print("Emergency Contact: ");
		x = scan.nextLine();
		return x;
	}
	
	public static int prompt_person_age()
	{
		int x;
		System.out.print("Age: ");
		x = scan.nextInt();
		scan.nextLine();
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
			case 2: process_remove_student_teacher();
				break;
			case 3: process_update_student_teacher();
				break;
			case 4: process_display_info();
				break;
			case 5: process_display_teachers_grade();
				break;
			case 6: process_display_students_grade();
				break;
			case 0: System.out.println("Exiting Database");
				break;
				
			}
			
		}
		while (main_menu_selection != 0);
		
		System.out.println("Have a good day.");
		
		
		
		
		

	}

}
