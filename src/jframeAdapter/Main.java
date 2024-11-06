package jframeAdapter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter2.Covid19PacientTableModelAdapter;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

	public class Main {

		public static void main(String[] args) {
			SymptomFactory sf = new SymptomFactory();
			Covid19Pacient m=new Covid19Pacient("Mikel", 32, sf);
			m.addSymptom(new Symptom("sm1", 10, 10), 1);
			m.addSymptom(new Symptom("sm2", 10, 10), 2);
			m.addSymptom(new Symptom("sm3", 10, 10), 3);
			m.addSymptom(new Symptom("sm4", 10, 10), 4);
			m.addSymptom(new Symptom("sm5", 10, 10), 5);
			
			
			Covid19Pacient j=new Covid19Pacient("Jon", 22, sf);
			j.addSymptom(new Symptom("sj1", 10, 10), 1);
			j.addSymptom(new Symptom("sj2", 10, 10), 2);
			j.addSymptom(new Symptom("sj3", 10, 10), 3);
			j.addSymptom(new Symptom("sj4", 10, 10), 4);
			j.addSymptom(new Symptom("sj5", 10, 10), 5);
			
			
			Covid19PacientTableModelAdapter pacientModelAdapter1=new Covid19PacientTableModelAdapter(m);   
			Covid19PacientTableModelAdapter pacientModelAdapter2=new Covid19PacientTableModelAdapter(j);
			
			JFrame jf1=new JFrame();
			JFrame jf2=new JFrame();

			JTable table1 = new JTable(pacientModelAdapter1);
			 jf1.add(new JScrollPane(table1));
			 
	         
		     jf1.setTitle(m.getName()+"'s symptoms");
		     jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		     jf1.pack();
		     jf1.setVisible(true);
		     
		     
			JTable table2 = new JTable(pacientModelAdapter2);
				jf2.add(new JScrollPane(table2));
				
			     jf2.setTitle(j.getName()+"'s symptoms");
			     jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
			     jf2.pack();
			     jf2.setVisible(true);

		}

	}

