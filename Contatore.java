import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contatore {
    //
    static JFrame f;
    static JPanel p1,p2;
    //
    static JLabel Counter;
    static JButton Incrementa,Decrementa,Reset;
    //
    static int counter = 0;
    public static void main(String[] args) {
        //
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Contatore");
        //
        Counter = new JLabel("Contattore: 0",JLabel.CENTER);
        Counter.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,18));
        //
        Incrementa = new JButton("Incrementa");
        Incrementa.setFocusable(false);
        Incrementa.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,18));
        Incrementa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == Incrementa){
                    counter++;
                    Counter.setText("Contattore: "+counter);
                }
            }
        });
        //
        Decrementa = new JButton("Decrementa");
        Decrementa.setFocusable(false);
        Decrementa.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,18));
        Decrementa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == Decrementa){
                    counter--;
                    Counter.setText("Contattore: "+counter);
                }
            }
        });
        //
        Reset = new JButton("Reset");
        Reset.setFocusable(false);
        Reset.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,18));
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == Reset){
                    counter = 0;
                    Counter.setText("Contattore: "+counter);
                }
            }
        });
        //
        p1 = new JPanel();
        p1.add(Counter);
        p1.setLayout(new GridLayout(1,1));
        //
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3));
        p2.add(Incrementa);
        p2.add(Reset);
        p2.add(Decrementa);
        //
        f.setLayout(new GridLayout(2,1));
        f.add(p1);
        f.add(p2);
        f.pack();
    }
}
