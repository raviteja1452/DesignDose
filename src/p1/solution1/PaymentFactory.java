package p1.solution1;

public class PaymentFactory {

    public static Payment getPayment(String paymentType){
        if(paymentType == null){
            return null;
        }
        switch(paymentType){
            case "DEBIT_CARD":
                return new DebitCardHandler();
            case "PAYTM_WALLET":
                return new PaytmHandler();
        }
        return null;
    }
}