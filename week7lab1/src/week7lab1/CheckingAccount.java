package week7lab1;

public class CheckingAccount extends Account
{
    private double limit;

    public CheckingAccount() 
    {

    }

    public void setLimit(double limit) 
    {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) 
    {
        if (getBalance() - amount >= -1 * limit) 
        {
            setBalance(getBalance() - amount);
        } 
        else 
        {
            System.out.println("Cannot withdraw from Account");
        }
    }    
}
