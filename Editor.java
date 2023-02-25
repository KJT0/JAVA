import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.*;
public class Editor {
    static int Dimensione;
    public static void main(String[] args) {
        //
        JFrame f = new JFrame("Editor di Testo");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        JMenuBar bar = new JMenuBar();
        //
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        //
        JMenuItem apri = new JMenuItem("Apri");
        JMenuItem salva = new JMenuItem("Salva");
        JMenuItem salvaconnome = new JMenuItem("Salva Con Nome");
        //
        JMenuItem copia = new JMenuItem("Copia");
        JMenuItem taglia = new JMenuItem("Taglia");
        JMenuItem incolla = new JMenuItem("Incolla");
        //
        file.add(apri);
        file.add(salva);
        file.add(salvaconnome);
        //
        edit.add(copia);
        edit.add(taglia);
        edit.add(incolla);
        //
        bar.add(file);
        bar.add(edit);
        //
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel();
        JTextArea txt = new JTextArea(100,100);
        JSpinner sp = new JSpinner();
        //
        p2.add(sp);
        p1.add(txt);
        //
        sp.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(e.getSource() == sp){
                    Dimensione = Integer.valueOf(sp.getValue().toString()).intValue();
                    txt.setFont(new Font("Arial",Font.PLAIN,Dimensione));
                }
            }
        });
        //
        f.setBackground(Color.BLACK);
        f.setJMenuBar(bar);
        f.add("North",p2);
        f.add("Center",p1);
        f.pack();
    }
}
