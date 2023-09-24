package decorator.p2;

public class CaramelDecorator extends BaseDecorator{
    public CaramelDecorator(BaseWaffle baseWaffle) {
        super(baseWaffle, 4,"caramel");
    }
}
