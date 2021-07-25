import java.awt.*;
import java.awt.event.*;

public class iteml implements ItemListener
{
    Frame f;
    Checkbox ck1, ck2;
    Label l1;
    iteml()
    {
        f= new Frame("Checkbox");
        ck1 = new Checkbox("HI");
        ck2 = new Checkbox("HELLO");
        l1 = new Label();
        f.add(ck1);
        f.add(ck2);
        ck1.addItemListener(this);
        ck2.addItemListener(this);
        f.setLayout(new FlowLayout());	
        f.setSize(220,150);
        f.setVisible(true);
}
public void itemStateChanged(ItemEvent ie)
{
    Checkbox ch =(Checkbox)ie.getItemSelectable();
    if(ch.getState()==true)
    {
        l1.setText(ch.getLabel()+ " is checked");
        f.add(l1);
        f.setVisible(true);
    }
    else
    {
        l1.setText(ch.getLabel()+ " is unchecked");
        f.add(l1);
        f.setVisible(true);
    }
}
public static void main(String asd[])
{
    iteml obj = new iteml();
}
}