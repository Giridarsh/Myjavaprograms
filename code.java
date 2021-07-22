import java.awt.*;
import javax.swing.*;
import java.Jframe.*;

class ten extends Frame
{
    venue()
    {
         JFrame f = new JFrame("Registration Form");
         f.setSize(1020, 768);
         f.getContentPane();
         f.setBackground(new Color(200,200,200));
         f.setLayout(null);
         JPanel p = new JPanel();
         p.setBounds(0, 0, 1020, 768);
         p.setBackground(new Color(150,150,150));
         f.add("p");
         p.add("Title"); 
         p.add("Header");
         p.add("FirstName");
         p.add("fn");
         p.add("LastName"); 
         p.add("ln");
         p.add("ID");
         p.add("id");
         p.add("GPA");
         p.add("gpa");
         p.add("Register");
         p.add("Exit"); 
         setVisible(true);
         f.setVisible(true);
    }
}

class code
{
    public static void main(String asd[])
    {
        ten obj = new ten();
    }
}
