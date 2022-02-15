package week6lab6;
import java.util.Date;

public class Account 
{
     private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate() 
    {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() 
    {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) 
    {
        if(balance < amount)
        {
            System.out.println("\tError(poor) no money");
            return;
        }
        balance -= amount;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }
}
