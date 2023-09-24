package decorator.p1;

public abstract class BaseWaffle {

    private Integer price;
    private String description;

    public BaseWaffle(Integer price, String description) {
        this.price = price;
        this.description = description;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }
}
