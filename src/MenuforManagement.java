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
		
		switch(num) {
		case 1 :
			System.out.print("Sports event : ");
			String sport = input.next();
			System.out.print("Frequency : ");
			int frequency = input.nextInt();
			System.out.print("Weigh : ");
			int weigh = input.nextInt();
			break;
			
		case 2 : 
		case 3 :
		case 4 :
			System.out.print("Sports event : ");
			String sport2 = input.next();			
	}
	}
	}
	}
