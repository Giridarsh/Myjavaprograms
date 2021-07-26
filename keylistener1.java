import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class keylistener1 implements KeyListener, ActionListener {
 
    JFrame frame;
    JTextField tf;
    JLabel lbl;
    JButton btn;
 
    public keylistener1() {
        frame = new JFrame();
        lbl = new JLabel();
        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(btn);
 
        frame.setLayout(new BorderLayout());
        frame.add(lbl, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
    public void keyTyped(KeyEvent ke) {
        lbl.setText("You have typed "+ke.getKeyChar());
    }
 

    public void keyPressed(KeyEvent ke) {
        lbl.setText("You have pressed "+ke.getKeyChar());
    }
 

    public void keyReleased(KeyEvent ke) {
        lbl.setText("You have released "+ke.getKeyChar());
    }
 

    public void actionPerformed(ActionEvent ae) {
        tf.setText("");
    }
 
    public static void main(String args[]) {
        new keylistener1();
    } 
}
