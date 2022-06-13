package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RoutineAdder;
import GUI.RoutineViewer;
import GUI.WindowFrame;

public class RoutineAdderCancelListener implements ActionListener {
	WindowFrame frame;

	public RoutineAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}

}
