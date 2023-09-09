package p1;

import p2.DebitCard;

public class HDFCDebitCard extends DebitCard {
    @Override
    public void withdrawAmount(int amount) {
        System.out.println("Withdrawing amount " + amount);
    }
}
