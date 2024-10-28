package iterator;

import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator {
	List<Symptom> symptoms;
	int position;
	
	public Covid19PacientAdapter(List<Symptom> symptoms) {
		this.symptoms=symptoms;
		this.position=symptoms.size()-1;
	}
	
	// return the actual element and go to the previous
	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	// true if there is a previous element
	@Override
	public boolean hasPrevious() {
		return position>0;
	}

	// It is placed in the last element
	@Override
	public void goLast() {
		position=symptoms.size();
	}
}
