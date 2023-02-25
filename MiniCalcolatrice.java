import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
public class MiniCalcolatrice {
    public static void main(String[] args) {
        //
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Calcolatore Scrauso");
        f.setVisible(true);
        //
        Font MyFont = new Font("Times New Roman",Font.PLAIN,17);
        //
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,6));
        //
        JLabel l1 = new JLabel("Operazione:");
        l1.setFont(MyFont);
        //
        JComboBox<String> Operazioni = new JComboBox<String>();
        Operazioni.setFont(MyFont);
        Operazioni.addItem("Addizione");
        Operazioni.addItem("Sottrazione");
        Operazioni.addItem("Moltiplicazione");
        Operazioni.addItem("Divisione");
        //
        JLabel l2 = new JLabel("    Numero 1:");
        l2.setFont(MyFont);
        //
        JTextField N1 = new JTextField("0");
        N1.setFont(MyFont);
        //
        JLabel l3 = new JLabel("    Numero 2:");
        l3.setFont(MyFont);
        //
        JTextField N2 = new JTextField("0");
        N2.setFont(MyFont);
        //
        JLabel l4 = new JLabel("    Risultato:");
        l4.setFont(MyFont);
        //
        JTextField Risultato = new JTextField();
        Risultato.setFont(MyFont);
        Risultato.setEditable(false);
        //
        JButton Submit = new JButton("INVIA");
        Submit.setFont(MyFont);
        Submit.setFocusable(false);
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == Submit) {
                    String Op = Operazioni.getSelectedItem().toString();
                    String a = N1.getText().toString();
                    Double A = Double.valueOf(a).doubleValue();

                    String b = N2.getText().toString();
                    Double B = Double.valueOf(b).doubleValue();
                    //
                    Double totale;
                    //
                    switch (Op) {
                        case "Addizione":

                            totale = A + B;
                            Risultato.setText(totale.toString());
                            break;
                        case "Sottrazione":
                            totale = A-B;
                            Risultato.setText(totale.toString());
                            break;
                        case "Moltiplicazione":
                            totale = A*B;
                            Risultato.setText(totale.toString());
                            break;
                        case "Divisione":
                            try{
                                totale = A/B;
                                Risultato.setText(totale.toString());
                            }
                            catch(ArithmeticException s){
                                JOptionPane.showMessageDialog(null,"Non puoi dividere per 0!","ATTENZIONE!",JOptionPane.WARNING_MESSAGE);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"UNKNOWN COMMAND!");
                            break;
                    }
                }
            }
        });
        //
        p1.add(l1);
        p1.add(Operazioni);
        p1.add(l2);
        p1.add(N1);
        p1.add(l3);
        p1.add(N2);
        p1.add(l4);
        p1.add(Risultato);
        p1.add(Submit);
        //
        f.add(p1);
        f.pack();
    }
}
