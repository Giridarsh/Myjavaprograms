import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
public class ml implements MouseListener
{
    JPanel lPanel, rPanel;
    JTextArea ta;
    JFrame f;
    public ml()
    {
        f = new JFrame("Mouse Listener");
        ta = new JTextArea();
        ta.setLineWrap(true);
        lPanel = new JPanel();
        rPanel = new JPanel();
        lPanel.setPreferredSize(new Dimension(200, 250));
        rPanel.setPreferredSize(new Dimension(200, 250));
        lPanel.setBackground(Color.ORANGE);
        rPanel.setBackground(Color.GREEN);
        lPanel.addMouseListener(this);
        rPanel.addMouseListener(this); 
        f.setLayout(new BorderLayout());
        f.add(lPanel, BorderLayout.NORTH);
        f.add(rPanel, BorderLayout.SOUTH);
        f.add(ta, BorderLayout.CENTER);
        ta.setPreferredSize(new Dimension(200,250));
        ta.setBounds(500,250,100,100);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e)
    {
        if (e.getSource() == lPanel)
        {
            ta.setText("You have clicked the left panel");
        }
        else
        {
            ta.setText("You have clicked the right panel");
        }
    }
    public void mousePressed(MouseEvent e)
    {
        if (e.getSource() == lPanel)
        {
            ta.setText("You have pressed the left panel");
        }
        else
        {
            ta.setText("You have pressed the right panel");
        }
    }
    public void mouseReleased(MouseEvent e)
    {
        if (e.getSource() == lPanel)
        {
            ta.setText("You have released mouse on left panel");
        }
        else
        {
            ta.setText("You have released mouse on right panel");
        }
    }
    public void mouseEntered(MouseEvent e)
   {
        if (e.getSource() == lPanel)
        {
            ta.setText("You have entered mouse on left panel");
        }
        else
        {
            ta.setText("You have entered mouse on right panel");
        }
    }
    public void mouseExited(MouseEvent e)
    {
        if (e.getSource() == lPanel)
        {
            ta.setText("You have exited mouse on left panel");
        } 
        else 
        {
            ta.setText("You have exited mouse on right panel");
        }
    }
    public static void main(String asd[])
    {
        ml obj = new ml();
    }
}