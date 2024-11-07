package observer;

import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter2.TableModel;
import adapter2.Covid19PacientTableModelAdapter;
import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		
			Covid19Pacient pacient1 = new Covid19Pacient("Aitor", 35, sf);
			new PacientObserverGUI(pacient1);
			new PacientSymptomGUI(pacient1);
			new PacientThermometerGUI(pacient1);
			
			
			Covid19Pacient pacient2 = new Covid19Pacient("Mikel", 55, sf);
			new PacientObserverGUI(pacient2);
			new PacientSymptomGUI(pacient2);
			new PacientThermometerGUI(pacient2);
			
			Covid19Pacient pacient3 = new Covid19Pacient("Ana", 35, sf);
			new PacientObserverGUI(pacient3);
			new PacientSymptomGUI(pacient3);
			new PacientThermometerGUI(pacient3);
			
			TableModel t =new TableModel(pacient3);
	}


}
