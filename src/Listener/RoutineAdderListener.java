package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Routine.LowerBody;
import Routine.RoutineInput;
import Routine.RoutineKind;
import manager.RoutineManager;

public class RoutineAdderListener implements ActionListener {
	RoutineManager routineManager;

	JTextField fieldEvent;
	JTextField fieldFrequency;
	JTextField fieldWeight;

	public RoutineAdderListener(
			JTextField fieldEvent, 
			JTextField fieldFrequency,
			JTextField fieldWeight,
			RoutineManager routineManager) {
		super();
		this.fieldEvent = fieldEvent;
		this.fieldFrequency = fieldFrequency;
		this.fieldWeight = fieldWeight;
		this.routineManager = routineManager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		RoutineInput routine = new LowerBody(RoutineKind.LowerBody);
		routine.setEvent(fieldEvent.getText());
		routine.setFrequency(Integer.parseInt(fieldFrequency.getText()));
		routine.setWeight(Integer.parseInt(fieldWeight.getText()));
		routineManager.addRoutine(routine);
		putObject(routineManager, "routinemanager.ser");
		routine.printInfo();
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
