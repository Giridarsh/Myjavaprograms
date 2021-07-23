import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

public class mml extends WindowAdapter implements MouseMotionListener
{
    Label label1, label2;
    Frame frame;
    String str;
    Point p;
    mml()
    {
        frame = new Frame("Window");
        label1= new Label("Tracking cursor in the Frame window");
        label2= new Label();
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(label2); 
        frame.addMouseMotionListener(this);
        frame.addWindowListener(this);
        frame.setSize(280,200);
        frame.setVisible(true);
    }
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
    public void mouseDragged(MouseEvent me)
    {
        String s = me.getX() + "," + me.getY();
        label2.setText("Mouse dragged "+ s);
        frame.setVisible(true);
    }
    public void mouseMoved(MouseEvent me)
    {
        String s = me.getX() + "," + me.getY();
        label2.setText("Mouse moved "+ s);
        frame.setVisible(true);
    }
    public static void main(String asd[])
    {
        mml obj = new mml();
    }
}