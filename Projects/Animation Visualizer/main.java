
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * AnimationVisualizer v 0.1
 * written with love by @author Anurag1389
 */

/*
 frame class is inherited from Frame implements Runnable and is the class resposible for animation 
*/
class frame extends Frame implements ActionListener, Runnable  {
    int curr_thread, delay, x, y;
    Button btn_new, btn_pause, btn_newThread;
    Label lab_threads, lab_reDrawTime, lab_x_coordinate, lab_y_coordinate,lab_time;//used as labels
    Label lab_show_threads, lab_show_delay, lab_show_x, lab_show_y, lab_show_time;// used to displaying the information
    Panel main;
    
    frame()
    {
        //Declaring components
        
        super("AnimationVisualizer v0.1");
        
        this.btn_new=new Button("New animation");
        this.btn_newThread=new Button("Add new thread");
        this.btn_pause=new Button("Pause animation");
    
        this.lab_reDrawTime=new Label("Current re-draw delay:");
        this.lab_threads=new Label("Current no of threads running: ");
        this.lab_time=new Label("Current time:");
        this.lab_x_coordinate=new Label("Current X-coordinate:");
        this.lab_y_coordinate=new Label("Current Y-coordinate:");
        
        this.lab_show_delay=new Label(" ");
        this.lab_show_threads=new Label(" ");
        this.lab_show_x=new Label(" ");
        this.lab_show_y=new Label(" ");
        this.lab_show_time=new Label(" ");
        
        
        setLayout(new BorderLayout());
                
        // adding the main panel...
        main=new Panel();
        main.setBackground(Color.red);
        add(main, BorderLayout.CENTER);
        
        Panel pan_btns = new Panel();
        Panel pan_left = new Panel();
        Panel pan_cen = new Panel();
        
        //setting the layout 
        pan_cen.setLayout(new GridLayout(10,1));
        pan_left.setLayout(new BorderLayout());
        pan_btns.setLayout(new FlowLayout());
        
        //configuring the left panel.....
        pan_left.add(pan_btns, BorderLayout.NORTH);
        pan_left.add(pan_cen, BorderLayout.CENTER);
        pan_left.add(new Label(" "), BorderLayout.WEST);
        
        
        //coloring the buttons
        this.btn_new.setBackground(Color.white);
        this.btn_new.setForeground(Color.BLUE);
        this.btn_newThread.setBackground(Color.WHITE);
        this.btn_newThread.setForeground(Color.blue);
        this.btn_pause.setBackground(Color.white);
        this.btn_pause.setForeground(Color.blue);
        
        
        
        //coloring the labels
        this.lab_reDrawTime.setForeground(Color.white);
        this.lab_reDrawTime.setForeground(Color.white);
        this.lab_threads.setForeground(Color.white);
        this.lab_time.setForeground(Color.white);
        this.lab_x_coordinate.setForeground(Color.white);
        this.lab_y_coordinate.setForeground(Color.white);
        
 
        //addin the buttons to the Buttonpanel
        pan_btns.add(this.btn_new);
        pan_btns.add(this.btn_newThread);
        pan_btns.add(this.btn_pause);
        
        
        //adding components to the centerPanel
        pan_cen.add(this.lab_threads);
        pan_cen.add(this.lab_show_threads);
        
        pan_cen.add(this.lab_reDrawTime);
        pan_cen.add(this.lab_show_delay);
        
        pan_cen.add(this.lab_time);
        pan_cen.add(this.lab_show_time);
        
        pan_cen.add(this.lab_x_coordinate);
        pan_cen.add(this.lab_show_x);
        
        pan_cen.add(this.lab_y_coordinate);
        pan_cen.add(this.lab_show_y);
        
        
        //setting the background of the panel
        pan_left.setBackground(Color.orange);
        //pan_cen.setBackground(Color.blue);
        //pan_btns.setBackground(Color.green);
        
        add(pan_left, BorderLayout.EAST);
        
        //adding listeners 
        this.btn_new.addActionListener(this) ;
        this.btn_newThread.addActionListener(this);
        this.btn_pause.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        
        
        
          if(this.btn_new.getActionCommand().equals("New animation"))
          {
            //invoking aniframe(it creates the new animation frame)
            AniFrame  af = new AniFrame();
            af.setSize(600, 600);
            af.setVisible(true);
          }
          else if(this.btn_newThread.getActionCommand().equals("Add new thread"))
          {
              
          }
        
    }

    @Override
    public void run() {
        this.lab_show_x.setText(String.valueOf(x));
        this.lab_show_y.setText(String.valueOf(y));
        repaint();
    }
    
    
    @Override
    public void paint (Graphics g){
     
     g.drawOval(x, y, 70, 70);
     
    }
    
    
    
    
    
   
}

// this class creates a frame for creating a new animation...
class AniFrame extends Frame {
    
}



public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frame fr = new frame();
        fr.setSize(900, 900);
        fr.setVisible(true);
    }
    
}


       
        
        
        
       
        
        
       
        
        
       
        
        
              
        
        
        
        
       
        
        
        
        
        
        