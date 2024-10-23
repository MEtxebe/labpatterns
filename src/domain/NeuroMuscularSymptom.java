package domain;

public class NeuroMuscularSymptom extends Symptom{
	private static NeuroMuscularSymptom instance;
	
    public static Symptom getInstance(String name, int covidImpact, int severityIndex) {
        if (instance == null) {
            instance = new NeuroMuscularSymptom(name, covidImpact, severityIndex);
        }
        return instance;
    }

	public NeuroMuscularSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
	}

}
