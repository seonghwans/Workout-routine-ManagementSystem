package Routine;

import java.io.Serializable;

public abstract class Routine implements RoutineInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6604979378878701387L;
	
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
	
	public abstract void printInfo();
}
