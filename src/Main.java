public class Main {
    public static void main(String[] args) {
       Payment creditCard = new CreditCardPayment();
       Payment paypal = new PayPalPayment();
       Payment bankAccount = new BankTransferPayment();

        processPayment(creditCard, 150);
        processPayment(paypal, 200.50);
        processPayment(bankAccount, 1000.0);

    }

    public static void processPayment(Payment paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
