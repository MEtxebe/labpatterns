package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator {
	List<Symptom> symptoms=new Vector<Symptom>();
	int position;
	
	public Covid19PacientAdapter(Set<Symptom> s) {
		Iterator<Symptom> i=s.iterator();
		while (i.hasNext())
			symptoms.add(i.next());
		position=symptoms.size()-1;
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
