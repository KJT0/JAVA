import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameSetter {
}

class BarSetter{
    public
   JMenuBar bar;
   JMenuItem item;
   JMenu file;
   BarSetter(){
       bar = new JMenuBar();
       file = new JMenu("File");
        item = new JMenuItem("Item");
   }

   JMenuBar GetBar(){
       return bar;
   }

   JMenuItem GetItem(){
       return item;
   }

   JMenu GetMenu(){
       return file;
   }
}
