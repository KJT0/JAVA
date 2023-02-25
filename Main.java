import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    //
    static JPanel p1;
    static JPanel p2;
    //
    static JPanel contenitore;
    static JPanel J1;
    static JPanel J2;
    static JPanel J3;
    static JPanel J4;
    //
    static JComboBox<String> Valore1;
    static JComboBox<String> Valore2;
    static JComboBox<String> Moltiplicatore;
    static JComboBox<String> Tolleranza;
    //
    static JButton Invio;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setTitle("Calcola Resistenze");
        f.setResizable(false);
        f.setVisible(true);
        //
        JLabel V1 = new JLabel("Valore 1:");
        //
        Valore1 = new JComboBox<String>();
        Valore1.addItem("Nero");
        Valore1.addItem("Marrone");
        Valore1.addItem("Rosso");
        Valore1.addItem("Arancione");
        Valore1.addItem("Giallo");
        Valore1.addItem("Verde");
        Valore1.addItem("Blu");
        Valore1.addItem("Viola");
        Valore1.addItem("Grigio");
        Valore1.addItem("Bianco");
        //
        JLabel V2 = new JLabel("Valore 2:");
        //
        Valore2 = new JComboBox<String>();
        Valore2.addItem("Nero");
        Valore2.addItem("Marrone");
        Valore2.addItem("Rosso");
        Valore2.addItem("Arancione");
        Valore2.addItem("Giallo");
        Valore2.addItem("Verde");
        Valore2.addItem("Blu");
        Valore2.addItem("Viola");
        Valore2.addItem("Grigio");
        Valore2.addItem("Bianco");
        //
        JLabel M = new JLabel("Moltiplicatore:");
        //
        Tolleranza = new JComboBox<String>();
        Tolleranza.addItem("Assente");
        Tolleranza.addItem("Oro");
        Tolleranza.addItem("Argento");
        //
        JLabel T = new JLabel("Tolleranza:");
        //
        Moltiplicatore = new JComboBox<String>();
        Moltiplicatore.addItem("Nero");
        Moltiplicatore.addItem("Marrone");
        Moltiplicatore.addItem("Rosso");
        Moltiplicatore.addItem("Arancione");
        Moltiplicatore.addItem("Giallo");
        Moltiplicatore.addItem("Verde");
        Moltiplicatore.addItem("Blu");
        Moltiplicatore.addItem("Oro");
        Moltiplicatore.addItem("Argento");
        //
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 8));
        p1.add(V1);
        p1.add(Valore1);
        p1.add(V2);
        p1.add(Valore2);
        p1.add(M);
        p1.add(Moltiplicatore);
        p1.add(T);
        p1.add(Tolleranza);
        //
        Invio = new JButton("Invia");
        Invio.setFocusable(false);
        Invio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer n1, n2, m;
                String t;
                // TODO Auto-generated method stub
                if (e.getSource() == Invio) {
                    String v1 = Valore1.getSelectedItem().toString();
                    n1 = switch (v1) {
                        case "Nero" -> 0;
                        case "Marrone" -> 1;
                        case "Rosso" -> 2;
                        case "Arancione" -> 3;
                        case "Giallo" -> 4;
                        case "Verde" -> 5;
                        case "Blu" -> 6;
                        case "Viola" -> 7;
                        case "Grigio" -> 8;
                        case "Bianco" -> 9;
                        default -> 0;
                    };
                    String v2 = Valore2.getSelectedItem().toString();
                    n2 = switch (v2) {
                        case "Nero" -> 0;
                        case "Marrone" -> 1;
                        case "Rosso" -> 2;
                        case "Arancione" -> 3;
                        case "Giallo" -> 4;
                        case "Verde" -> 5;
                        case "Blu" -> 6;
                        case "Viola" -> 7;
                        case "Grigio" -> 8;
                        case "Bianco" -> 9;
                        default -> 0;
                    };
                    String multiplier = Moltiplicatore.getSelectedItem().toString();
                    m = switch (multiplier) {
                        case "Nero" -> 1;
                        case "Marrone" -> 10;
                        case "Rosso" -> 100;
                        case "Arancione" -> 1000;
                        case "Giallo" -> 10000;
                        case "Verde" -> 100000;
                        case "Blu" -> 1000000;
                        case "Oro" -> 10; //%
                        case "Argento" -> 100;
                        default -> 0;

                    };
                    String toll = Tolleranza.getSelectedItem().toString();
                    t = switch (toll) {
                        case "Assente" -> "";
                        case "Oro" -> "%5";
                        case "Argento" -> "%10";
                        default -> "0";
                    };
                    //
                    String s = n1.toString();
                    String s2 = n2.toString();

                    String s3 = s + s2;
                    int tot = Integer.parseInt(s3);
                    JOptionPane.showMessageDialog(null, "La tua resistenza vale:" + tot * m + t + " Ohm");
                    //

                }
            }
        });
        //
        p1.add(Invio);
        //
        f.add(p1);
        f.pack();
        //

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}