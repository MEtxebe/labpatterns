package adapter2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import java.util.Observable;
import java.util.Observer;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel implements Observer{
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =new String[] {"Symptom", "Weight" };
	  protected ArrayList<Symptom> sList;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	    this.sList=new ArrayList<>(pacient.getSymptoms());
	    
	    p.addObserver(this);
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return this.columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge
		  return this.columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return this.sList.size();
	  }

	  public Object getValueAt(int row, int col) {	        
	        if (col == 0) {
	            return sList.get(row); 
	        } else if (col == 1) {
	            return pacient.getWeight(sList.get(row)); 
	        }	        
	        return null;
	  }

	@Override
	public void update(Observable o, Object arg) {
		sList= new ArrayList<>(((Covid19Pacient) o).getSymptoms());
		fireTableDataChanged();
	}
}