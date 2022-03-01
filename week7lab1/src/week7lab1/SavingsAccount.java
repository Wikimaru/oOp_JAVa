package week7lab1;

public class SavingsAccount extends Account
{
    public SavingsAccount() 
    {
    }

    @Override
    public void withdraw(double amount) 
    {
        if (getBalance() - amount >= 0) 
        {
            setBalance(getBalance() - amount);
        }
        else 
        {
            System.out.println("Cannot withdraw from Account");
        }
    }
}
