import java.awt.*;  
public class textareademo
{  
  textareademo()
  {  
    Frame textArea_f= new Frame();  
    TextArea area=new TextArea("Welcome to studytonight.com");  
    area.setBounds(30,40, 200,200);  
    textArea_f.add(area);  
    textArea_f.setSize(300,300);  
    textArea_f.setLayout(null);  
    textArea_f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new textareademo();  
  }  
}