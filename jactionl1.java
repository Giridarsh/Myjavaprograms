import javax.swing.*; 
 import java.awt.*; 
 import java.awt.event.*; 

class jactionl extends JFrame implements ActionListener 
{ 
     JLabel lblData; 
     JButton btnOk,btnCancel; 
     ActionListenerExample() 
     { 
         setLayout(new FlowLayout()); 
         lblData = new JLabel("Click any button to display data"); 
         btnOk=new JButton("OK"); 
         btnCancel = new JButton("Cancel");  
         btnOk.addActionListener(this); 
         btnCancel.addActionListener(this); 
         add(lblData); 
         add(btnOk); 
         add(btnCancel); 
       }  
       public void actionPerformed(ActionEvent e) 
       { 
           if(e.getSource() == btnOk) 
           lblData.setText("OK Button is Clicked "); 
           else 
           lblData.setText("Cancel Button is Clicked "); 
        } 
    } 
    class jactionl1 
    { 
         public static void main(String args[]) 
         { 
             jactionl frame = new jactionl(); 
             frame.setTitle("ActionListener in Java Swing Examples"); 
             frame.setBounds(200,150,180,150); 
             frame.setDefaultCloseOperation(JFrame.EXIT-ON-CLOSE); 
             frame.setVisible(true); 
          } 
     } 