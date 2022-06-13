package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listener.AddButtonListener;
import Listener.ViewButtonListener;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
	
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Routine");
		JButton button2 = new JButton("Delete Routine");
		JButton button3 = new JButton("Edit Routine");
		JButton button4 = new JButton("View Routine");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new AddButtonListener(frame));
		button4.addActionListener(new ViewButtonListener(frame));
		

		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
	
		
		
	}
}
