package decorator.p2;

public abstract class BaseDecorator extends BaseWaffle {
    private BaseWaffle baseWaffle;
    private Integer price;
    private String description;

    public BaseDecorator(BaseWaffle baseWaffle, final Integer price, final String description) {
        super(price, description);
        this.baseWaffle = baseWaffle;
        this.price = price;
        this.description = description;
    }

    @Override
    public Integer getPrice() {
        return baseWaffle.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return baseWaffle.getDescription() + " ," + description;
    }
}
