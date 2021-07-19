import java.awt.*;    
public class checkboxgroupdemo
{    
  checkboxgroupdemo(){    
    Frame ck_groupf= new Frame("studytonight ==>CheckboxGroup");    
    CheckboxGroupobj = new CheckboxGroup();  
    Checkbox ckBox1 = new Checkbox("Yes", obj, true);    
    ckBox1.setBounds(100,100, 50,50);    
    Checkbox ckBox2 = new Checkbox("No", obj, false);    
    ckBox2.setBounds(100,150, 50,50);    
    ck_groupf.add(ckBox1);    
    ck_groupf.add(ckBox2);    
    ck_groupf.setSize(400,400);    
    ck_groupf.setLayout(null);    
    ck_groupf.setVisible(true);    
  }    
  public static void main(String args[])    
  {    
    new checkboxgroupdemo();    
  }    
}