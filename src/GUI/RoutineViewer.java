package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Routine.RoutineInput;
import manager.RoutineManager;

public class RoutineViewer extends JPanel{
	WindowFrame frame;
	
	RoutineManager routineManager;
	
	public RoutineManager getRoutineManager() {
		return routineManager;
	}

	public void setRoutineManager(RoutineManager routineManager) {
		this.routineManager = routineManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("EVENT");
		model.addColumn("FREQUENCY");
		model.addColumn("WEIGHT");
		for (int i = 0; i<routineManager.size(); i++) {
			Vector row = new Vector();
			RoutineInput ri =routineManager.get(i);
			row.add(ri.getEvent());
			row.add(ri.getFrequency());
			row.add(ri.getWeight());
			model.addRow(row); 
		}
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public RoutineViewer(WindowFrame frame,	RoutineManager routineManager) { 
		this.frame = frame;
		this.routineManager = routineManager;
		
		System.out.println("***" + routineManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("EVENT");
		model.addColumn("FREQUENCY");
		model.addColumn("WEIGHT");
		
		for (int i = 0; i<routineManager.size(); i++) {
			Vector row = new Vector();
			RoutineInput ri =routineManager.get(i);
			row.add(ri.getEvent());
			row.add(ri.getFrequency());
			row.add(ri.getWeight());
			model.addRow(row); 
		}
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

		
	}

}
