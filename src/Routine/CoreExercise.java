package Routine;

import java.util.Scanner;

public class CoreExercise extends Routine {
	public CoreExercise(RoutineKind kind) {
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
		
		System.out.print("Weight : ");
		int weight = input.nextInt();
		this.setWeight(weight);
		

	}
}
