package p2;

public abstract class DebitCard {
    private String owner;
    private Long Id;
    private String password;
    private boolean isActive;


    public abstract void withdrawAmount(int amount) ;

    public boolean isActive() {
        System.out.println("in isActive method");
        return isActive;
    }
}