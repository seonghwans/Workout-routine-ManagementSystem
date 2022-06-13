package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.RoutineManager;

public class WindowFrame extends JFrame {
	
	RoutineManager routineManager;
	
	MenuSelection menuSelection;
	RoutineAdder routineadder;
	RoutineViewer routineviewer;


	public WindowFrame(RoutineManager routineManager) {
		
		this.routineManager = routineManager;
		
		this.menuSelection = new MenuSelection(this);
		this.routineadder = new RoutineAdder(this, this.routineManager);
		this.routineviewer = new RoutineViewer(this, this.routineManager);
	
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		

		this.add(menuSelection);
		
		this.setVisible(true);
	}
	
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();				
	}

	public MenuSelection getMenuSelection() {
		return menuSelection;
	}


	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}


	public RoutineAdder getRoutineadder() {
		return routineadder;
	}


	public void setRoutineadder(RoutineAdder routineadder) {
		this.routineadder = routineadder;
	}


	public RoutineViewer getRoutineviewer() {
		return routineviewer;
	}


	public void setRoutineviewer(RoutineViewer routineviewer) {
		this.routineviewer = routineviewer;
	}


}
