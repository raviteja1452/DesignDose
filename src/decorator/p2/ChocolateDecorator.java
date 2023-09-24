package decorator.p2;

public class ChocolateDecorator extends BaseDecorator{
    public ChocolateDecorator(BaseWaffle baseWaffle) {
        super(baseWaffle, 2, "chocolate");
    }
}
