import java.util.Scanner;

public class MenuforManagement {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {	
			System.out.println("1. Add routine");
			System.out.println("2. Delete routine");
			System.out.println("3. Edit routine");
			System.out.println("4. View routine");
			System.out.println("5. Go to menu");
			System.out.println("6. exit");
			System.out.print("Select one number : ");
			num = input.nextInt();

			if(num==1) {
				addRoutine();
			}
			else if(num==2) {
				deleteRoutine();
			}
			else if(num==3) {
				editRoutine();
			}
			else if(num==4) {
				viewRoutine();
			}
		}
	}

	public static void addRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.print("Event : ");
		String event = input.next();
		System.out.print("Frequency : ");
		int frequency = input.nextInt();
		System.out.print("Weigh : ");
		int weigh = input.nextInt();

	}
	public static void deleteRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.print("Event : ");
		String event = input.next();
	}
	public static void editRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.print("Event : ");
		String event = input.next();
	}
	public static void viewRoutine() {
		Scanner input = new Scanner(System.in);
		System.out.print("Event : ");
		String event = input.next();
	}
}
