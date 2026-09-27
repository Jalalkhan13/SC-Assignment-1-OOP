public class DigitalWalletTest {

    public static void main(String[] args) {

        DigitalWallet wallet =
                new DigitalWallet("Jalal", 5000, "1234");

        System.out.println("Account Holder: "
                + wallet.getAccountHolder());

        System.out.println("Initial Balance: "
                + wallet.getBalance());

        boolean result =
                wallet.withdraw(1000, "1234");

        System.out.println("Withdrawal successful: " + result);

        System.out.println("Remaining Balance: "
                + wallet.getBalance());

        boolean wrongPin =
                wallet.withdraw(500, "9999");

        System.out.println("Wrong PIN withdrawal: "
                + wrongPin);
    }
}