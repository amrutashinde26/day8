package OopsFeatures;

public class BankAccount
{
    private double balance;
    private double accountNumber;

    public static void main(String args[])
    {
        BankAccount bankaccount1 = new BankAccount(50000,1254876);
      System.out.println(  bankaccount1.deposit(10000));
       System.out.println( bankaccount1.withdraw(5000));
    }
    public BankAccount(double balance,double accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public double getBalance()
    {
        return balance ;
    }
    public double getAccountNumber()
    {
        return accountNumber;
    }
    public double deposit(double amount)
    { if(amount>0)
    {
        double result = balance + amount;
    }

    public double withdraw(double amount)
    {  if(amount >0 && amount <= balance)
    {
        double result = balance - amount;
    } else if (amount > balance)
    {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println("amount should be positive");
         }
        return  result;
    }
}
