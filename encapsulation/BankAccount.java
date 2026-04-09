class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(5000);

        System.out.println(a.getBalance());
    }
}
