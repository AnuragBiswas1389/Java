
package awt_drawing;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;


class frame extends Frame{
   
    Menu file,sub;
    MenuItem open, save, autosave, close;
    CheckboxMenuItem auto;
    TextField tf;
    
    frame(){
        this.open=new MenuItem("open");
        this.close=new MenuItem("close");
        this.autosave= new MenuItem("autoSave");
        this.save=new MenuItem("close");
        this.auto=new CheckboxMenuItem("Auto");
        this.tf=new TextField();
        
        file=new Menu("File");
        sub=new Menu("sub");
        
        sub.add(autosave);
        
        file.add(open);
        file.add(close);
        file.add(save);
        file.add(auto);
        file.add(sub);
        
        MenuBar m = new MenuBar();
        m.add(file);
        setMenuBar(m);
        setLayout(new FlowLayout());
        add(tf);
        
    }
    
    
    
}





public class AWT_drawing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frame fr = new frame();
        fr.setSize(600,600);
        fr.setVisible(true);
    }
    
}
