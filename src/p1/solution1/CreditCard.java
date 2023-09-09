package p1.solution1;

public class CreditCard{
    /*
    .
    .
    Rest of the card methods
    .
    .
    */
    public void Pay(String paymentType){
        Payment payment = PaymentFactory.getPayment(paymentType);
        payment.pay();
    }

}
