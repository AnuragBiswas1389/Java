
package swing_border;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;



class frame extends JFrame{
     JPanel p;
    
    frame(){
    p = new JPanel()    ;
    p.add(new Button("button1"));
    p.add(new Button("button2"));
    Border br = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    p.setBorder(br);
    setLayout(new FlowLayout());
    add(p);
    }
}
        

public class Swing_border  {

  
    public static void main(String[] args) {
        frame  fr = new frame();
        fr.setSize(600,600);
        fr.setVisible(true);
    }
    
}
