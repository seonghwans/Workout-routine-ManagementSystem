package Routine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LowerBody extends Routine implements RoutineInput {
	public LowerBody(RoutineKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Event : ");
		String event = input.next();
		this.setEvent(event);

		char answer = 'x';
		while(answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.print("Can you do event? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("Frequency : ");
				int frequency = input.nextInt();
				this.setFrequency(frequency);
				break;
			}
			else if(answer == 'N' || answer == 'n'){
				this.setFrequency((Integer) null);
				break;
			}
			else {

			}
		}
		
		if(weight == 0 ) {
			try {
				System.out.print("Weight : ");
				int weight = input.nextInt();
				this.setWeight(weight);
			} 
			catch(InputMismatchException e){
				System.out.println("Error. Please put number ");
				if(input.hasNext()) {
					input.next();
				}
				weight = 0;
			}
		}
				
				else{
					int weight = input.nextInt();
					this.setWeight(weight);
			}
		}





	public void printInfo() {
		String skind = "none";
		switch(this.kind){
		case UpperBody:
			skind = "Upper.";
			break;
		case LowerBody:
			skind = "Lower.";
			break; 
		case CoreExercise:
			skind = "Core.";
			break;
		default:

		}
		System.out.println("\n "+ "kind : "+ skind + "\n" + "event : " +event + "\n"+ "frequency : " +frequency +"\n"+ "weight :" + weight+ "kg" + "\n");
	}
}
