package domain;

public class DigestiveSymptom extends Symptom{
	
	private static DigestiveSymptom instance;
	
    public static Symptom getInstance(String name, int covidImpact, int severityIndex) {
        if (instance == null) {
            instance = new DigestiveSymptom(name, covidImpact, severityIndex);
        }
        return instance;
    }

	public DigestiveSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
	}

}
