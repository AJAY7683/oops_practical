class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = Math.max(balance, 0);
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposit successful: " + amount);
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
        return true;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aman Kumar", "1234567890", 5000);

        account.displayAccount();
        System.out.println();

        account.deposit(2000);
        account.deposit(-500);
        account.withdraw(1000);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\nUpdated account details:");
        account.displayAccount();
    }
}
