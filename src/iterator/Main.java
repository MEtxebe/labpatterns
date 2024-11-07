package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.ComSevIndex;
import adapter.ComSymptomName;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

	public class Main {

		public static void main(String[] args) {
			SymptomFactory sf = new SymptomFactory();
			Covid19Pacient p=new Covid19Pacient("Ane", 29, sf);
			p.addSymptom(new Symptom("s1", 10, 1), 1);
			p.addSymptom(new Symptom("s2", 10, 20), 2);
			p.addSymptom(new Symptom("s5", 10, 5), 5);
			p.addSymptom(new Symptom("s3", 10, 30), 3);
			p.addSymptom(new Symptom("s9", 10, 9), 9);
			
			Covid19PacientAdapter i = new Covid19PacientAdapter(p);
			
			ComSymptomName comName = new ComSymptomName();
			ComSevIndex comInd = new ComSevIndex();
			
			System.out.println("Ordenatu gabe");
			while(i.hasPrevious()) {
				System.out.println(i.previous());
			}
			
			
			Iterator<Symptom> it= Sorting.sortedIterator(i, comName);
			System.out.println("Izenen arabera ordenatua");
			while(it.hasNext()) {
				System.out.println(it.next());
			}	
			
			it=Sorting.sortedIterator(i, comInd);	
			System.out.println("Larritasunaren arabera ordenatua");
			while(it.hasNext()) {
				System.out.println(it.next());
			}	
			
				
		}
	}

