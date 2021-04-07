import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class datetime
{    
      static public void main(String asd[])
      {    
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            System.out.println(dtf.format(now));  
      }    
} 