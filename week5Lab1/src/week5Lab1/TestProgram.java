package week5Lab1;

public class TestProgram {

      public static void main(String[] args) {
        Account account = new Account(1122,20000);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date when this account was created: " + account.getDateCreated());
    }
    
}
