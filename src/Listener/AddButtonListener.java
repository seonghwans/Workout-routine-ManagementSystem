package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.RoutineAdder;
import GUI.RoutineViewer;
import GUI.WindowFrame;

public class AddButtonListener implements ActionListener {
	WindowFrame frame;

	public AddButtonListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getRoutineadder());
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton) e.getSource();
//		RoutineAdder adder = frame.getRoutineadder();
//		frame.setupPanel(adder);
	}

}
