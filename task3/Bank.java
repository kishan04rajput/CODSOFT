public class Bank {
    private int balance;

    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }

    public static void main(String[] args) {

    }

    public void Withdraw(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}
