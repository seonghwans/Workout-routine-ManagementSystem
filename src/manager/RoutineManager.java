package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Routine.CoreExercise;
import Routine.LowerBody;
import Routine.Routine;
import Routine.RoutineInput;
import Routine.RoutineKind;
import Routine.UpperBody;

public class RoutineManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3363874260422332818L;
	
	ArrayList<RoutineInput> routines = new ArrayList<RoutineInput>();
	transient Scanner input;
	RoutineManager(Scanner input){
		this.input=input;
	}

	public void addRoutine(String event, int frequency, int weight) {
		RoutineInput routineInput = new LowerBody(RoutineKind.LowerBody);
		routineInput.getUserInput(input);
		routines.add(routineInput);
	}
	
	public void addRoutine(RoutineInput routineInput) {
		routines.add(routineInput);
	}

	public void addRoutine() {
		int kind = 0;
		RoutineInput routineInput;
		while (kind != 1 && kind !=2) {	
			try {
				System.out.println(" 1 for LowerBody  ");
				System.out.println(" 2 for UpperBody  ");
				System.out.println(" 3 for Core Exercise  ");
				System.out.print(" Select Routine Kind 1~3 : ");

				kind = input.nextInt(); 
				if (kind == 1) {
					routineInput = new LowerBody(RoutineKind.LowerBody);
					routineInput.getUserInput(input);
					routines.add(routineInput);
					break;
				}
				else if (kind ==2) {
					routineInput = new UpperBody(RoutineKind.UpperBody);
					routineInput.getUserInput(input);
					routines.add(routineInput);
					break;
				}
				else if (kind ==3) {
					routineInput = new CoreExercise(RoutineKind.CoreExercise); 
					routineInput.getUserInput(input);
					routines.add(routineInput);
					break;
				}
				else {
					System.out.print(" Select Routine Kind 1~4 ");
				}

			}
			catch(InputMismatchException e) {
				System.out.println(" *Please put a number between 1 - 3!! *");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;

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
			System.out.println("this routine"+ event +" is deleted");

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
			RoutineInput routineInput = routines.get(i);
			if(routineInput.getEvent().equals(routineEvent)){
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
						routineInput.setEvent(event);

					}
					else if(num==2) {
						System.out.println("frequency : ");
						int frequency = input.nextInt();
						routineInput.setFrequency(frequency);
					}
					else if(num==3) {
						System.out.println("weigh : ");
						int weight = input.nextInt();
						routineInput.setWeight(weight);
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
		System.out.println("The number of Registered events : " +routines.size());
		for(int i= 0; i<routines.size(); i++) {
			routines.get(i).printInfo();
		}
	}
	
	public int size() {
		return routines.size();
	}
	public RoutineInput get(int index) {
		return (Routine) routines.get(index);
	}
	
}

