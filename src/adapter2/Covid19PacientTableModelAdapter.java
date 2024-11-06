package adapter2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =new String[] {"Symptom", "Weight" };
	  protected ArrayList<Symptom> sList;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	    this.sList=new ArrayList<>(pacient.getSymptoms());
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
	}
