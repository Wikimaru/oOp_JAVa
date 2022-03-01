package week7lab2;
import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public NewAccount(String name, int id, double balance) 
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String getName() 
    {
        return name;
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
        balance -= amount;
        transactions.add(new Transaction('w', amount, balance, "NULL"));
    }

    public void deposit(double amount) 
    {
        balance += amount;
        transactions.add(new Transaction('d', amount, balance, "NULL"));
    }

    public ArrayList<Transaction> getTransactions() 
    {
        return transactions;
    }
}
