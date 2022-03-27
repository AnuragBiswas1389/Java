
package swift_toolbar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;


class frame extends JFrame implements ActionListener {
    JToolBar tb;
    JButton b1, b2;
    JTextArea ta;
    
    frame(){
        super("toolbar demo");
        this.ta=new JTextArea();
        JScrollPane tx = new JScrollPane(ta);
        
        this.b1= new JButton(new ImageIcon("E:\\Downloads\\toolbar.png"));
        this.b2= new JButton(new ImageIcon("E:\\Downloads\\toolbar2.png"));
        
        tb = new JToolBar();
        tb.add(b1);
        tb.add(new JToolBar.Separator());
        tb.add(b2);
        
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("file");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem close = new JMenuItem("close");
        file.add(open);
        file.add(close);
        menu.add(file);
        
        setJMenuBar(menu);
        add(tb,BorderLayout.NORTH);
        add(tx,BorderLayout.CENTER);
        
        open.addActionListener(this);
        close.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("open")){
            JFileChooser fi = new JFileChooser();
            fi.showOpenDialog(this);
            File f = fi.getSelectedFile();
            try{
            FileInputStream fx=new FileInputStream(f);
            byte b[]=new byte[fx.available()];
            fx.read(b);
            String str=new String(b);
            ta.setText(str);
            fx.close();
            
        }
        catch(Exception b){}
        }
        }
        
        
        
        
        
        
        
        
    }
    








public class Swift_toolbar {

    
    public static void main(String[] args) {
     
       frame f=new frame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
