import java.io.*;
import java.lang.*;
import java.util.*;

class bank
{
    static public void main(String asd[])
    {  
      int balance = 5000, withdraw, deposit;
      Scanner s = new Scanner(System.in);
      try
      {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform:");

            int a = s.nextInt();
            switch(a)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been deposited successfully");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.out.println("EXIT");
                System.exit(0);
            }
          }  
          catch(Exception e) {} 
        
     }   
}

