package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			Covid19Pacient pacient = new Covid19Pacient("Aitor", 35);
			new PacientObserverGUI(pacient);
			new PacientSymptonGUI(pacient);
	}


}
