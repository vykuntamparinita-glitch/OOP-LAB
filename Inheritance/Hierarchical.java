class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void showBalance() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate / 100));
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String name, double balance, double overdraftLimit) {
        super(name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void showLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Amit", 10000, 5);
        CurrentAccount c = new CurrentAccount("Neha", 20000, 5000);

        s.showBalance();
        s.calculateInterest();

        c.showBalance();
        c.showLimit();
    }
}