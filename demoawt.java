import java.awt.*;

class set extends Frame
{
    Label l1 = new Label("First Name : ");
    Label l2 = new Label("Last Name : "); 
    Label l3 = new Label("Email ID : ");
    Label l4 = new Label("Password : ");
    Label l5 = new Label("Date of Birth : ");
    Label l6 = new Label("Blood Group : ");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();
    
    set()
    {
        setVisible(true);
        setSize(400,600);
        setBackground(Color.yellow);
        setTitle("Form");

        Panel p1 = new Panel(new GridLayout(6,6));
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
        add(p1);
        t4.setEchoChar('*');
        p1.setBounds(40,240,140,10);

    }
}

class demoawt
{
    public static void main(String asd[])
    {
        set obj = new set();
    }
}















