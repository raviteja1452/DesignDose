package decorator.p2;

public class HoneyDecorator extends BaseDecorator{
    public HoneyDecorator(BaseWaffle baseWaffle) {
        super(baseWaffle,  3, "honey");
    }
}
