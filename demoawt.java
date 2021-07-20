import java.awt.*;

class set extends Frame
{
    JLabel l1 = new JLabel("First Name : ");
    JLabel l2 = new JLabel("Last Name : "); 
    JLabel l3 = new JLabel("Email ID : ");
    JLabel l4 = new JLabel("Password : ");
    JLabel l5 = new JLabel("Date of Birth : ");
    JLabel l6 = new JLabel("Blood Group : ");
    JLabel l7 = new JLabel("Gender : ");
    JCheckbox c1 = new JCheckbox("Male", true);
    JCheckbox c2 = new JCheckbox("Female");
    JButton b1 =  new JButton("Submit");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    
    set()
    {
        setLayout(null);
        setVisible(true);
        setSize(200,400);
        setBackground(Color.yellow);
        setTitle("Form");

        JPanel p1 = new JPanel(new GridLayout(6,2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        t4.setEchoChar('*');
        p1.setBounds(100,100,300,120);
        c1.setBounds(200,200,300,120);
        c1.setSize(70,30);
        add(c1);
        c2.setBounds(100,100,300,120);
        c2.setSize(100,100);
        add(c2);
        b1.setBounds(250,250,70,30);
        add(b1);
        add(p1);
    }
}

class demoawt
{
    public static void main(String asd[])
    {
        set obj = new set();
    }
}















