package domain;

public class RespiratorySymptom extends Symptom{
	
	private static RespiratorySymptom instance;
	
    public static Symptom getInstance(String name, int covidImpact, int severityIndex) {
        if (instance == null) {
            instance = new RespiratorySymptom(name, covidImpact, severityIndex);
        }
        return instance;
    }
    
	public RespiratorySymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}

}
