
package awt_layout_manager;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



class MyFrame extends Frame implements ItemListener{
    
    Button b1, b2, b3;
    Checkbox b7,b8;
    TextField  b4, b5, b6;
    CardLayout cl;
    Panel p1,p2,op,cp;
    
   public MyFrame()  {
       super("gridbag layout example");
       
       CheckboxGroup cg = new CheckboxGroup();
       
       this.b1= new Button("button 1");
       this.b2= new Button("button 2");
       this.b3= new Button("button 3");
       b8=new Checkbox("textFields",false,cg);
       this.b4= new TextField();
       this.b5= new TextField();
       this.b6= new TextField();
       this.b7= new Checkbox("Buttonss",true,cg);
       
       b7.addItemListener(this);
       b8.addItemListener(this);
       
        op = new Panel();
        op.add(b7);
        op.add(b8);
       
       
        p1 = new Panel();
            p1.add(b1);
            p1.add(b2);
            p1.add(b3);
        
         p2 = new Panel();
            p2.add(b4);
            p2.add(b5);
            p2.add(b6);
       
         cl = new CardLayout();
            
            
          cp = new Panel();
          cp.setLayout(cl);
            cp.add("one",p1);
            cp.add("two",p2);
            
            
        BorderLayout bl = new BorderLayout()    ;
        setLayout(bl);
        
        add(op,BorderLayout.NORTH);
        add(cp,BorderLayout.CENTER);
       
               
               
}

    @Override
    public void itemStateChanged(ItemEvent e) {
    
        if(b8.getState()){
            cl.last(p1);
            
        }else{
            cl.last(p2);
        }
        
    }
    
 
   
   
   
   
   
    
}


public class Awt_layout_manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MyFrame frame = new MyFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
        
        
        
        
        
    }
    
}
