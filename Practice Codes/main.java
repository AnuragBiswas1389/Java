
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




class frame extends JFrame {
    int counter=0;
    JLabel l;
    JButton b;
        frame(){
     setLayout(new FlowLayout());
     l= new JLabel(" ");
     b = new JButton("click me");
     getRootPane().setDefaultButton(b);
     b.setIcon(new ImageIcon("E:\\Downloads\.png"));
     add(l);
     add(b);
     
     b.addActionListener((ActionEvent e) -> {
         counter++;
         l.setText(String.valueOf(counter));
     });
               }
}




public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frame fr = new frame();
        fr.setSize(600,600);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
}
