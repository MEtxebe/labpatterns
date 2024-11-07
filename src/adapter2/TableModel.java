package adapter2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;

public class TableModel{
	private JFrame jf1;
    private Covid19PacientTableModelAdapter pacientModelAdapter;
    private JTable table;

    public TableModel(Covid19Pacient o) {
    	jf1= new JFrame();
        pacientModelAdapter = new Covid19PacientTableModelAdapter(o);
        table = new JTable(pacientModelAdapter);

        jf1.add(new JScrollPane(table));

        jf1.setTitle("Covid Symptoms " + o.getName());
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.pack();
        jf1.setVisible(true);
    }
}