package Routine;

import java.util.Scanner;

public interface RoutineInput {

	public String getEvent();
	
	public int getFrequency();
	
	public int getWeight();
	
	public void setEvent(String event);		//interface 를 사용해서 고관련함수 사용가능

	public void setFrequency(int frequency);			//interface 를 사용해서 고관련함수 사용가능

	public void setWeight(int weight); 
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
