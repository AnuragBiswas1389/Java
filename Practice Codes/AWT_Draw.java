/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awt_draw;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class frame extends Frame implements Runnable{
  
    int x, y;
    int tx,ty;
    Button b ;
    
    frame(){
        super("drawing demo");
        x=100;
        y=100;
        tx=ty=1;
        this.b=new Button("new animation");
        Thread t = new Thread(this);
                  t.start();
        setLayout(new FlowLayout());
        add(b);
        addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent e){
             
            }
        });
        
        
                  
        b.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                  t.start();
                }
        });
    }
    
    @Override
    public void paint (Graphics g){
     g.setColor(Color.ORANGE);
     g.fillOval(x, y, 80, 90);
     
 
     
      
    }

    @Override
    public void run() {
       x+=tx;
       y+=ty;
       if(x<0|| x>500){
           tx=tx*-1;
       }if(y<0|| y>500){
           ty=ty*-1;
       }
       repaint();
       try{
       Thread.sleep(5);
       }catch(Exception e){
           
       }
    }
    
}





/**
 *
 * @author Dell
 */
public class AWT_Draw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frame fra = new frame();
        fra.setSize(600,600);
        fra.setVisible(true);
    }
    
}
