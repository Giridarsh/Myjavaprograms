import javax.swing.*;      
import java.awt.event.*; 
import java.awt.*; 


class windowsl2 extends JFrame implements WindowListener 
{ 
    windowsl2() 
    {   
        addWindowListener(this); 
    } 
    public void windowClosing(WindowEvent e) 
    { 
        System.out.println("Window Closing"); 
        dispose(); 
        System.exit(0); 
    } 
    public void windowOpened(WindowEvent e) 
    {
        System.out.println("Window Open");
    } 
    public void windowClosed(WindowEvent e) 
    {
        System.out.println("Window Closed");
    } 
    public void windowActivated(WindowEvent e) 
    {
        System.out.println("Window Activated");
    } 
    public void windowDeactivated(WindowEvent e) 
    {
        System.out.println("Window Deactivated");
    } 
    public void windowIconified(WindowEvent e) 
    {
        System.out.println("window Iconified");
    } 
    public void windowDeiconified(WindowEvent e) 
    {
        System.out.println("Window Deiconified");
    } 
} 
class windowl2 
{ 
    public static void main(String[] args) 
    { 
        windowsl2 frame = new windowsl2(); 
        frame.setTitle("Window Listener Example"); 
        frame.setBounds(100,200,200,200); 
        frame.setVisible(true); 
    } 
} 
 
