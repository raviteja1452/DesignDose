package p2;

import p1.HDFCDebitCard;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        DebitCard debit = new SBIDebitCard();
        debit.withdrawAmount(123);

        DebitCard debit2 = new HDFCDebitCard();

    }
}
