package freddy_guerra_final_project;

import java.util.Scanner;
import java.util.ArrayList;

public class main_code
{
	
	static Scanner scan = new Scanner(System.in);
	
	public static int display_main_menu()
	{
		//Displays Main Menu
		System.out.println("----------Main Menu----------");
		System.out.println("1. Teachers");
		System.out.println("2. Students");
		System.out.println("3. Exit");
		System.out.println("-----------------------------");
		System.out.println("Enter Selection");
		int main_menu_selection = scan.nextInt();
		
		return main_menu_selection;
	}
	
	public static int main_menu_error_check(int x)
	{
		while (x < 1 || x > 3)
		{
			System.out.print("Error!!! Please enter a valid selection: ");
			x = scan.nextInt();
		}
		
		return x;
	}
	
	public static int teacher_menu()
	{
		System.out.println("----------Teacher Menu---------");
		System.out.println("1. Add Teacher");
		System.out.println("2. Remove Teacher");
		System.out.println("3. Update Teacher");
		System.out.println("4. View Teachers");
		System.out.println("5. Back to Main Menu");
		System.out.println("-------------------");
		System.out.println("Enter Selection");
		int teacher_selection = scan.nextInt();
		
		return teacher_selection;
		
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
			case 1: teacher_menu();
				break;
			case 2: System.out.println("----------Students---------");
				break;
			case 3: System.out.println("Exiting Database");
				break;
			}
			
		}
		while (main_menu_selection != 3);
		
		System.out.println("Have a good day.");
		
		
		
		
		

	}

}
