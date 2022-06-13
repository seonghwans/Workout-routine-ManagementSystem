package Routine;

import java.util.Scanner;

public interface RoutineInput {

	public String getEvent();
	
	public int getFrequency();
	
	public int getWeight();
	
	public void setEvent(String event);		//interface �� ����ؼ� ������Լ� ��밡��

	public void setFrequency(int frequency);			//interface �� ����ؼ� ������Լ� ��밡��

	public void setWeight(int weight); 
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
