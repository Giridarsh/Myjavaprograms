class Account
{  
      private long accno;  
      private String name,email;  
      private float amount;  
      public long getAcc_no()
      {  
            return accno;  
      }  
      public void setAcc_no(long accno)
      {  
            this.accno = accno;  
      }  
      public String getName()
      {  
            return name;  
      }  
      public void setName(String name)
      {  
            this.name = name;  
      }  
      public String getEmail()
      {  
            return email;  
      }  
      public void setEmail(String email)
      {  
            this.email = email;  
      }  
      public float getAmount()
      {  
            
            return amount;  
      }  
      public void setAmount(float amount)
      {  
            this.amount = amount;  
      }  
  
} 
public class fourtyseven
{  
      static public void main(String asd[])
      {  
            Account acc=new Account();  
            acc.setAcc_no(16104038L);  
            acc.setName("Giridarsh");  
            acc.setEmail("giridarsh98@gmail.com");
            acc.setAmount(20000f);  
            System.out.println(acc.getAcc_no()+"\n"+acc.getName()+"\n"+acc.getEmail()+"\n"+acc.getAmount());  
      }  
}  