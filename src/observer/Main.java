package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			Covid19Pacient pacient1 = new Covid19Pacient("Aitor", 35);
			new PacientObserverGUI(pacient1);
			new PacientSymptomGUI(pacient1);
			
			
			Covid19Pacient pacient2 = new Covid19Pacient("Mikel", 55);
			new PacientObserverGUI(pacient2);
			new PacientSymptomGUI(pacient2);
			new PacientThermometerGUI(pacient2);
	}


}
