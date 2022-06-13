package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import logging.EventLogger;

public class MenuforManagement {
	static EventLogger logger = new EventLogger("Log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		RoutineManager routineManager = getObject("routinemanager.ser");
		if(routineManager == null) {
			routineManager = new RoutineManager(input);

		}
				
		WindowFrame windowFrame = new WindowFrame(routineManager); 
		
		selectMenu(input, routineManager);	
		putObject(routineManager, "routinemanager.ser");
	}

	public static void selectMenu(Scanner input, RoutineManager routineManager) {
		int num = -1;		
		while (num != 5) {	
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1: 
					routineManager.addRoutine();
					logger.log("Add a routine");
					break;
				case 2:
					routineManager.deleteRoutine();
					logger.log("Delete a routine");
					break;
				case 3:
					routineManager.editRoutine();
					logger.log("Edit a routine");
					break;
				case 4:
					routineManager.viewRoutines();
					logger.log("View a routine");
					break;
				default:
					continue;
				}	
			}
			catch(InputMismatchException e) {
				System.out.println(" *Please put a number between 1 - 5!! *");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}

		}

	}


	public static void showMenu() {
		System.out.println("1. Add routine");
		System.out.println("2. Delete routine");
		System.out.println("3. Edit routine");
		System.out.println("4. View routines");
		System.out.println("5. Exit");
		System.out.print("Select one number : ");

	}
	public static RoutineManager getObject(String filename) {
		RoutineManager routineManager = null;	
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			routineManager = (RoutineManager)in.readObject();
			in.close();
			file.close();
			} catch (FileNotFoundException e) {
				return routineManager	;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}		
		return routineManager;
	}
	public static void putObject(RoutineManager routineManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(routineManager);
			
			out.close();
			file.close();
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	
}

