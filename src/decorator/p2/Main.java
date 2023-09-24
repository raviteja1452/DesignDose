package decorator.p2;

public class Main {

    public static void main(String[] args) {
        // Belgian Waffle with Honey, Caramel

        BaseWaffle waffle = new BelgianWaffle();
        System.out.println("waffle : " + waffle.getDescription() +  " ---- $" + waffle.getPrice());

        waffle = new HoneyDecorator(waffle);
        System.out.println("waffle : " + waffle.getDescription() +  " ---- $" + waffle.getPrice());


        waffle = new CaramelDecorator(waffle);
        System.out.println("waffle : " + waffle.getDescription() +  " ---- $" + waffle.getPrice());

        waffle = new CaramelDecorator(waffle);
        System.out.println("waffle : " + waffle.getDescription() +  " ---- $" + waffle.getPrice());


        BaseWaffle waffle2 = new WheatWaffle();
        System.out.println("waffle : " + waffle2.getDescription() +  " ---- $" + waffle2.getPrice());

        waffle2 = new ChocolateDecorator(waffle2);
        System.out.println("waffle : " + waffle2.getDescription() +  " ---- $" + waffle2.getPrice());


        waffle2 = new CaramelDecorator(waffle2);
        System.out.println("waffle : " + waffle2.getDescription() +  " ---- $" + waffle2.getPrice());

    }
}
