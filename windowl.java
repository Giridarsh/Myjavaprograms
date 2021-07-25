import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
 
public class windowl
{
    public static void main(String asd[])
    {
        JFrame frame = new JFrame("Window Listener");
        WindowListener listener = new WindowAdapter()
        {
             public void windowClosing(WindowEvent w)
             {
                 System.exit(0);
             }
        };
        frame.addWindowListener(listener);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}