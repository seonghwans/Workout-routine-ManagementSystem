package Routine;

import java.util.Scanner;

public class Routine {
	protected RoutineKind kind = RoutineKind.LowerBody;
	protected String event;
	protected int frequency;
	protected int weight;

	public Routine() {
	}

	public Routine(RoutineKind kind) {
		this.kind = kind;
	}
	
	public Routine(String event, int frequency) {
		this.event = event;
		this.frequency = frequency;
	}

	public Routine (String event, int frequency, int weight) {
		this.event = event;
		this.frequency = frequency;
		this.weight= weight;
	}
	public Routine (RoutineKind kind, String event, int frequency, int weight) {
		this.kind = kind;
		this.event = event;
		this.frequency = frequency;
		this.weight= weight;
	}
	
	public RoutineKind getKind() {
		return kind;
	}

	public void setKind(RoutineKind kind) {
		this.kind = kind;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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
		System.out.println("kind : "+ skind + "event : " +event + "\n"+ "frequency : " +frequency +"\n"+ "weight :" + weight+ "kg" + "\n");
	}
	

	
	public void getUserInput(Scanner input) {
		System.out.print("Event : ");
		String event = input.next();
		this.setEvent(event);
		
		System.out.print("Frequency : ");
		int frequency = input.nextInt();
		this.setFrequency(frequency);
		
		System.out.print("Weight : ");
		int weight = input.nextInt();
		this.setWeight(weight);
	}
}
