abstract class BankAccount
{
      public abstract void deposit();
      public abstract void withdraw();
}
class SavingsAccount extends BankAccount
{
      public void deposit()
     {
            System.out.println("SavingsAccount");
      }
      public void withdraw()
     {
            System.out.println("Withdraw SavingsAccount\n");
     }
}
class CurrentAccount extends BankAccount
{
      public void deposit()
      {
             System.out.println("CurrentAccount");
      }
      public void withdraw()
      {
             System.out.println("Withdraw CurrentAccount\n");
      }
}

class DepositAccount extends BankAccount
{
      public void deposit()
      {
            System.out.println("DepositAccount");
      }
      public void withdraw()
      {
            System.out.println("Withraw DepositAccount");
      }
} 
class thirtyseven
{
      public static void main(String args[])
     {
            BankAccount obj = new SavingsAccount();
            obj.deposit();
            obj.withdraw();
            BankAccount obj1 = new CurrentAccount();
            obj1.deposit();
            obj1.withdraw();
            BankAccount obj2 = new DepositAccount();
            obj2.deposit();
            obj2.withdraw();
      }
}