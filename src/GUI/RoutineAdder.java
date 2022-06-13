package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.RoutineAdderCancelListener;
import Listener.RoutineAdderListener;
import manager.RoutineManager;

public class RoutineAdder extends JPanel {
	WindowFrame frame;
	RoutineManager routineManager;
	
	public RoutineAdder(WindowFrame frame, RoutineManager routineManager) {
		
		this.frame = frame;
		this.routineManager = routineManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelEvent = new JLabel("Event: ", JLabel.TRAILING);
		JTextField fieldEvent = new JTextField(10);
		labelEvent.setLabelFor(fieldEvent);
		panel.add(labelEvent);
		panel.add(fieldEvent);
		
		JLabel labelFrequency = new JLabel("Frequency: ", JLabel.TRAILING);
		JTextField fieldFrequency = new JTextField(10);
		labelEvent.setLabelFor(fieldFrequency);
		panel.add(labelFrequency);
		panel.add(fieldFrequency);
		
		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new RoutineAdderListener(fieldEvent,fieldFrequency,fieldWeight,routineManager));
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new RoutineAdderCancelListener(frame));
		
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		panel.add(saveButton);
		panel.add(cancelButton);
			
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
	
		
		this.add(panel);
		this.setVisible(true);
	}
	

}
