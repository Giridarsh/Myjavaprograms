import java.io.*;
import java.lang.*;

class hi
{
       int amountWithdrawing, amountDepositing;
       int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;
        
      public void displayBalance()
     {
           System.out.println("Current Balance : " + balance);
           System.out.println();
     }
     public void amountWithdrawing()
     {
          System.out.println("Withdrawn Operation:");
          System.out.println("Withdrawing Amount : "+ withdrawAmount);
          if (balance >= withdrawAmount) 
          {
               balance = balance - withdrawAmount;
               System.out.println("Please collect your money and collect the card");
               
          }
          else 
          {
               System.out.println("Sorry! Insufficient Funds");
               System.out.println();
          }
 }

     public void amountdepositing()
     {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "+ depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        
        
    } 
 
}


class ATM
{
    static public void main(String args[])
    {
        hi obj = new hi();
        obj.displayBalance();
        obj.amountWithdrawing();
        obj.amountdepositing();
     
    }
}
