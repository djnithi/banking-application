package sanwitch;

import java.util.Scanner;

import static java.lang.Math.abs;

public class netbanking {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount obj=new BankAccount("user name","User id");
        obj.ShowMenu();
    }
}
class BankAccount {
    int Balance;
    int previousTransactions;
    String customerName;
    String CustomerId;

    BankAccount(String cName, String cId) {
        customerName = cName;
        CustomerId = cId;
    }

    void Deposite(int Amount) {
        if (Amount != 0) {
            Balance = Balance + Amount;
            previousTransactions = Amount;
        }
    }

    void withdraw(int Amount) {
        if (Amount != 0) {
            Balance = Balance - Amount;
            previousTransactions = -Amount;
        }

    }

    void getPreviousTransactions() {
        if (previousTransactions > 0) {
            System.out.println("Deposited:" + previousTransactions);
        } else if (previousTransactions < 0) {
            System.out.println("Withdrawn:" + abs(previousTransactions));
        } else {
            System.out.println("No Transaction occured");
        }
    }

    void ShowMenu() {
        char option = '0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome :" + customerName);
        System.out.println("Your id is :" + CustomerId);
        System.out.println("\n");
        System.out.println("A. CheckBalance");
        System.out.println("B. Deposite");
        System.out.println("C. withdraw");
        System.out.println("D. previous Transactions");
        System.out.println("E.Exit");

        do {
            System.out.println("************************************************************");
            System.out.println("Enter an option");
            System.out.println("************************************************************");
            option = sc.next().charAt(0);
            System.out.println("\n");


            switch (option) {
                case 'A':
                    System.out.println("*******************************************************");
                    System.out.println("Balance=" + Balance);
                    System.out.println("*******************************************************");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("********************************************************");
                    System.out.println("Enter the amount to deposite");
                    System.out.println("********************************************************");
                    int amount = sc.nextInt();
                    Deposite(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("**********************************************************");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("***********************************************************");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("************************************************************");
                    getPreviousTransactions();
                    System.out.println("*************************************************************");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("*************************************************************");
                    System.out.println("Thank you for using our services");
                    break;
                default:
                    System.out.println("Invalid option please Enter again");
                    break;
            }
        } while (Character.isAlphabetic(option));
        System.out.println("Thanks for using our services");
    }
}























