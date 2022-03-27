
package awt_textarea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class myframe extends Frame implements ActionListener{
    
    TextArea ta;
    TextField tf,tc;
    Label l,lab_choice;
    Button b,btn_choice;
    
    myframe(){
        super("text box ");
        this.ta=new TextArea(10,30);
        this.tf=new TextField(10);
        
        this.tc=new TextField("enter the option to perform",10);
        
        this.l =new Label("no text selcted");
        this.lab_choice = new Label("1. load selected text\n2.Enter text\n3.enter text in carrot positon");
        
        this.b =new Button("Load");
        this.btn_choice = new Button("OK");
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(tf);
        
        add(l);
        add(this.lab_choice);
        
        add(b);
        add(this.tc);
        add(this.btn_choice);
        
        
        b.addActionListener(this);
      //  this.btn_choice.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(ta.getSelectedText());
        
        
        
        
    }
    
}


public class AWT_textArea {
    
 
    public static void main(String[] args) {
        
        myframe frame = new myframe();
        
        frame.setSize(500, 300);
        
        frame.setVisible(true);
        
        
    }
    
}
