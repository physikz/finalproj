package freddy_guerra_final_project;

import java.util.Scanner;
import java.util.ArrayList;

public class main_code
{
	
	static Scanner scan = new Scanner(System.in);
	
	public static int display_main_menu()
	{//start...Main Menu
		//Displays Main Menu
		System.out.println("----------Main Menu----------");
		System.out.println("1. Teachers");
		System.out.println("2. Students");
		System.out.println("3. Exit");
		System.out.println("-----------------------------");
		System.out.println("Enter Selection");
		int main_menu_selection = scan.nextInt();
		
		System.out.println("");
		return main_menu_selection;
	}//end...Main Menu
	
	public static int main_menu_error_check(int x)
	{//start...Main Menu Error Check
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
		}
		
		return x;
	}//end...Main Menu Error Check
	
	public static int teacher_menu_error_check(int x)
	{//start...Teacher Menu Error Check
		while (x < 1 || x > 5)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
		}
		
		return x;
	}//end...Teacher Menu Error Check
	
	public static int display_teacher_menu()
	{//start...Teacher Menu
		//Display Teacher Menu
		System.out.println("----------Teacher Menu---------");
		System.out.println("1. Add Teacher");
		System.out.println("2. Remove Teacher");
		System.out.println("3. Update Teacher");
		System.out.println("4. View Teachers");
		System.out.println("5. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int teacher_selection = scan.nextInt();
		
		teacher_selection = teacher_menu_error_check(teacher_selection);
		
		System.out.println("");
		return teacher_selection;
	}//end...Teacher Menu

	public static int student_menu_error_check(int x)
	{//start...Student Menu Error Check
		while (x < 1 || x > 5)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
		}
		
		return x;
	}//end...Student Menu Error Check
	
	public static int display_student_menu()
	{
		//Display Student Menu
		System.out.println("----------Student Menu---------");
		System.out.println("1. Add Student");
		System.out.println("2. Remove Student");
		System.out.println("3. Update Student");
		System.out.println("4. View Students");
		System.out.println("5. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int student_selection = scan.nextInt();
		
		student_selection = student_menu_error_check(student_selection);
		
		System.out.println("");
		return student_selection;
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
			case 1: display_teacher_menu();
				break;
			case 2: display_student_menu();
				break;
			case 3: System.out.println("Exiting Database");
				break;
			}
			
		}
		while (main_menu_selection != 3);
		
		System.out.println("Have a good day.");
		
		
		
		
		

	}

}
