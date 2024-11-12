public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("bank transfer payment of " + amount + " processed");
    }
}
