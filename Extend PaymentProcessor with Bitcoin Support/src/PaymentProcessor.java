public class PaymentProcessor {
    public void processPayment(CreditCard card){
        System.out.println("Processing Credit Card Payment");
    }
    public void processPayment(Paypal paypal){
        System.out.println("processing paypal Payment");
    }

    public void processPayment(Bitcoin bitcoin){

        System.out.println("processing bitcoin payment: "+ bitcoin.getTransactionId());
    }
}
