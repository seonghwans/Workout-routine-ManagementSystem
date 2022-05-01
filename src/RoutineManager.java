import java.util.ArrayList;
import java.util.Scanner;

import Routine.CoreExercise;
import Routine.LowerBody;
import Routine.Routine;
import Routine.RoutineKind;
import Routine.UpperBody;

public class RoutineManager {
	ArrayList<Routine> routines = new ArrayList<Routine>();
	Scanner input;
	RoutineManager(Scanner input){
		this.input=input;
	}
	
	
	public void addRoutine() {
		int kind = 0;
		Routine routine;
		while (kind != 1 && kind !=2) {	
		System.out.println(" 1 for LowerBody  ");
		System.out.println(" 2 for UpperBody  ");
		System.out.println(" 3 for Core Exercise  ");
		System.out.print(" Select Routine Kind 1~3 : ");

		kind = input.nextInt();
		if (kind == 1) {
			routine = new LowerBody(RoutineKind.LowerBody);
			routine.getUserInput(input);
			routines.add(routine);
			break;
		}
		else if (kind ==2) {
			routine = new UpperBody(RoutineKind.UpperBody);
			routine.getUserInput(input);
			routines.add(routine);
			break;
		}
		else if (kind ==3) {
			routine = new CoreExercise(RoutineKind.CoreExercise); 
			routine.getUserInput(input);
			routines.add(routine);
			break;
		}
		else {
			System.out.print(" Select Routine Kind 1~4 ");
		}
	}
			
	}
	
	public void deleteRoutine() {
		System.out.print("Event : ");
		String event = input.next();
		int index= -1;
		for(int i= 0; i<routines.size(); i++) {
			if(routines.get(i).getEvent().equals(event)) {
				index = i;
				break;
			}
		}
		if (index >=0 ) {
			routines.remove(index);
			System.out.println("this routine"+ event +"is deleted");
			
		}
		else {
			System.out.println("there are no events");
			return;
		}
	
	
	}
	public void editRoutine() {
		System.out.print("Event : ");
		String routineEvent = input.next();
		for(int i= 0; i<routines.size(); i++) {
			Routine routine = routines.get(i);
			if(routine.getEvent().equals(routineEvent)){
				int num = -1;
				while (num != 4) {
					System.out.println("1. Edit event");
					System.out.println("2. Edit frequency");
					System.out.println("3. Edit weight");
					System.out.println("4. Exit");
					System.out.print("Select one number : ");
					num = input.nextInt();

					if(num==1) {
						System.out.println("Event : ");
						String event = input.next();
						routine.setEvent(event);
						
					}
					else if(num==2) {
						System.out.println("frequency : ");
						int frequency = input.nextInt();
						routine.setFrequency(frequency);
					}
					else if(num==3) {
						System.out.println("weigh : ");
						int weight = input.nextInt();
						routine.setWeight(weight);
					}
					else {
						continue;
					}
				}
				break;
		}

		}
	}
	public void viewRoutines() {
//		System.out.print("Event : ");
//		String event = input.next();
		System.out.println("# of registered events : " +routines.size());
		for(int i= 0; i<routines.size(); i++) {
			routines.get(i).printInfo();
		}
	}
}

