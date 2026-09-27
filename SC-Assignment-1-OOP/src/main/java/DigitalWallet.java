public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private final String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }

        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount, String enteredPin) {

        if (!pinCode.equals(enteredPin)) {
            return false;
        }

        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
}