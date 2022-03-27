
package adapter.classes;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

class Myframe extends Frame {
    Label tf;
    Button b;
    int counter=0;
    
    Myframe(){
        this.tf= new Label(" ");
        this.b= new Button("click me");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
       
        // using lambda expression.........................
        b.addActionListener((ActionEvent e) ->
        {
            tf.setText(""+counter);
            counter++;
        } 
        );
        
        
        
        
    }
    
    
    
   /* 
    class Action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText(""+counter);
            counter++;
            
            
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
*/
    
    
}








public class AdapterClasses {

    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
}
