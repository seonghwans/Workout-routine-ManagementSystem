package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.RoutineViewer;
import GUI.WindowFrame;
import manager.RoutineManager;

public class ViewButtonListener implements ActionListener {
	WindowFrame frame;

	public ViewButtonListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		RoutineManager routineManager = getObject("routinemanager.ser");
		RoutineViewer routineViewer = frame.getRoutineviewer();
		routineViewer.setRoutineManager(routineManager);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(routineViewer);
		frame.revalidate();
		frame.repaint();

		//		JButton b = (JButton) e.getSource();
		//		RoutineViewer viewer = frame.getRoutineviewer();
		//		frame.setupPanel(viewer);
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

}
