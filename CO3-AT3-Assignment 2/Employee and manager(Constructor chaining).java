import java.util.Scanner;

public class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber = sc.nextLine();
        String accountHolderName = sc.nextLine();
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();

        SavingsAccount savings = new SavingsAccount(
            accountNumber,
            accountHolderName,
            balance,
            interestRate
        );

        savings.displayDetails();

        sc.close();
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void displayDetails() {
        System.out.println("Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + interestRate + "%");
        System.out.println("Annual Interest Earned: " + calculateInterest());
    }
}