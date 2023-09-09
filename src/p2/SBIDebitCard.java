package p2;

public class SBIDebitCard extends DebitCard{

    @Override
    public void withdrawAmount(int amount) {
        System.out.println("Withdrawing amount " + amount);
    }
}
