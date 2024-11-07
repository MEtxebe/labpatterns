package adapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;


public class Sorting { 
	public static Iterator sortedIterator(InvertedIterator it, Comparator comparator) { 
		List list = new ArrayList(); 
		it.goLast(); 
		while (it.hasPrevious()) { 
			Symptom s=(Symptom)it.previous(); 
			list.add(s); 
		} 
		Collections.sort(list, comparator); 
		return list.iterator(); 
	} 
}  