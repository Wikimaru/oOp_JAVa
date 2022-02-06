/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5Lab1;

/**
 *
 * @author ASUS
 */
public class TestProgram {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date when this account was created: " + account.getDateCreated());
    }
    
}
