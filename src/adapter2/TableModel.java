package adapter2;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;


public class TableModel implements Observer{
	
	public  TableModel(Covid19Pacient o) {
		Covid19PacientTableModelAdapter pacientModelAdapter1=new Covid19PacientTableModelAdapter(o);
		
		JFrame jf1=new JFrame();
		
		JTable table1 = new JTable(pacientModelAdapter1);
		 jf1.add(new JScrollPane(table1));
         
	     jf1.setTitle("Covid Symptoms " + o.getName());
	     jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	     jf1.pack();
	     jf1.setVisible(true);
	     
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		jf1.add(new JScrollPane(table1));
	}
	
	
}
