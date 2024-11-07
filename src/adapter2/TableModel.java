package adapter2;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;


public class TableModel implements Observer{
	private JFrame jf1 = new JFrame();
    private Covid19PacientTableModelAdapter pacientModelAdapter;
    private JTable table;

    public TableModel(Covid19Pacient o) {
        // Crea un único adaptador y la tabla
        this.pacientModelAdapter = new Covid19PacientTableModelAdapter(o);
        this.table = new JTable(pacientModelAdapter);

        jf1.add(new JScrollPane(table));

        jf1.setTitle("Covid Symptoms " + o.getName());
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.pack();
        jf1.setVisible(true);

        // Añade el TableModel como observador
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // Notifica al adaptador de que los datos han cambiado
        pacientModelAdapter.fireTableDataChanged();
        System.out.println(((Covid19Pacient) o).getSymptoms());
    }
}
