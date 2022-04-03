import java.util.Scanner;

public class MenuforManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RoutineManager routineManager = new RoutineManager(input);

		int num = -1;		
		
		
		while (num != 5) {	
			System.out.println("1. Add routine");
			System.out.println("2. Delete routine");
			System.out.println("3. Edit routine");
			System.out.println("4. View routine");
			System.out.println("5. exit");
			System.out.print("Select one number : ");
			num = input.nextInt();

			if(num==1) {
				routineManager.addRoutine();
			}
			else if(num==2) {
				routineManager.deleteRoutine();
			}
			else if(num==3) {
				routineManager.editRoutine();
			}
			else if(num==4) {
				routineManager.viewRoutine();
			}
			else {
				continue;
			}
		}
	}
}

