import java.util.Scanner;

public class XManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String mail = null;
		int id = 0;
		String name = null;
		int phonenum = 0;
		int a = 0;
		while (a!=6) {
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Edit Student");
			System.out.println("4. View Student");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("------------------------------------");
			System.out.print("Select the number : ");
			a = input.nextInt();
			
			switch (a) {
			case 1:
				System.out.print("Type your Student ID : ");
				id = input.nextInt();
				input.nextLine(); //added
				System.out.print("Type your name : ");
				name = input.nextLine();
				System.out.print("Type your e-mail address : ");
				mail = input.nextLine();
				System.out.print("Type your Phone number (no hyphen) : ");
				phonenum = input.nextInt();
				System.out.println("------------------------------------");
				break;
			case 2:
				id = 0;
				name = null;
				mail = null;
				phonenum = 0;
				System.out.println("Removed All your data");
				System.out.println("------------------------------------");
				break;
			case 3:
				System.out.print("(Re) Type your name : ");
				name = input.nextLine();
				System.out.println("------------------------------------");
				break;
			case 4:
				System.out.println("Your Student ID : " + id);
				System.out.println("Your name : " + name);
				System.out.println("e-mail address : " + mail);
				System.out.println("Your Phone number : +82 " + phonenum);
				System.out.println("------------------------------------");
				break;
			case 5:
				System.out.println("Return to menu....");
				System.out.println("------------------------------------");
				break;
			case 6:
				break;
			default:
				System.out.println("Please type another number...");
				System.out.println("------------------------------------");
				break;
			}
		}
		System.out.println("The program Ended.");
	}
}


