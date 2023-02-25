import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;

class AutomobileGUI {
    public static void main(String[] args) {
        //
        JFrame f = new JFrame("Automobili Grafiche");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        JPanel p1 = new JPanel(new GridLayout(6,2));
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new GridLayout(6,2));
        //
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Tab Login",p1);
        tabs.addTab("Dati inseriti",p3);
        //
        JLabel l1 = new JLabel("Targa:");
        JTextField txt1 = new JTextField("",7);
        //
        JLabel l2 = new JLabel("Nome e Cognome proprietario:");
        JTextField txt2 = new JTextField("",7);
        //
        JLabel l3 = new JLabel("Marca e Modello:");
        JTextField txt3 = new JTextField();
        //
        JLabel l4 = new JLabel("Massa Massima:");
        JSpinner sp = new JSpinner();
        //
        JLabel l5 = new JLabel("Posti auto:");
        JComboBox<Integer>box = new JComboBox<Integer>();
        for(int i = 0;i<=10;i++){
            box.addItem(i);
        }
        //
        JButton conferma = new JButton("Invia Dati!");
        conferma.setFocusable(false);
        //
        p1.add(l1);
        p1.add(txt1);
        p1.add(l2);
        p1.add(txt2);
        p1.add(l3);
        p1.add(txt3);
        p1.add(l4);
        p1.add(sp);
        p1.add(l5);
        p1.add(box);
        p1.add(p2);
        p2.add(conferma,"Center");
        //
        //
        JLabel l11 = new JLabel("Targa:");
        JTextField txt11 = new JTextField("",7);
        //
        JLabel l22 = new JLabel("Nome e Cognome proprietario:");
        JTextField txt22 = new JTextField("",7);
        //
        JLabel l33 = new JLabel("Marca e Modello:");
        JTextField txt33 = new JTextField();
        //
        JLabel l44 = new JLabel("Massa Massima:");
        JTextField txt44 = new JTextField();
        //
        JLabel l55 = new JLabel("Posti auto:");
        JTextField txt55 = new JTextField();
        //
        JTextField fildini[] = {txt11,txt22,txt33,txt44,txt55};
        JLabel labelini[] = {l11,l22,l33,l44,l55};
        for(int i = 0;i<5;i++){
            p3.add(labelini[i]);
            fildini[i].setEditable(false);
            p3.add(fildini[i]);
        }
        //
        conferma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean Error = false;
                if(e.getSource() == conferma){
                    //
                    if(txt1.getText().equals("") || txt1.getText().length() > 7){
                        txt1.setText("");
                        JOptionPane.showMessageDialog(null,"La targa non può superare i 7 caratteri!");
                        Error = true;
                    }
                    //
                    if(txt2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Devi compilare i campi!");
                        Error = true;
                    }
                    //
                    if(txt3.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Devi compilare i campi!");
                        Error = true;
                    }
                    //
                    if(((int) sp.getValue()) >= 3000 ){
                        JOptionPane.showMessageDialog(null,"Non puoi superare il valore 3000");
                        Error = true;
                    }
                    else if( (int) sp.getValue() < 0){
                        JOptionPane.showMessageDialog(null,"Non puoi mettere un valore minore di 0");
                    }
                    if(Error == false){
                        conferma.setEnabled(false);
                        conferma.setText("Dati Inviati!");
                        txt11.setText(txt1.getText());
                        txt22.setText(txt2.getText());
                        txt33.setText(txt3.getText());
                        txt44.setText(sp.getValue().toString());
                        txt55.setText(box.getSelectedItem().toString());
                    }
                }
            }
        });
        tabs.setTabPlacement(JTabbedPane.LEFT);
        f.getContentPane().add(tabs);
        f.pack();
        //
    }
}