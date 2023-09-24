package decorator.p1;

public class WheatWaffle extends BaseWaffle {

    private Integer price;
    private String description;
    public WheatWaffle(Integer price, String description) {
        super(10 + price, "Wheat Waffle" + "," +  description);
    }
}


// Honey , Chocolate, Caramel, StrawBerry, Cashew, Badam, Gems

// Base -> Wheat
/** - 7!
 * 1. Waffle only with Honey
 * 3. Waffle only with Chocolate
 * 4. Waffle only with Caramel
 * 5. Waffle only with StrawBerry
 * 6. Waffle only with Badam
 * 7. Waffle only with Gems
 * 8. Waffle with Honey, Chocolate
 * 9. Waffle with Honey, Caramel
 * 10. Waffle with Honey, StrawBerry
 * 11. Waffle with Honey, Cashew
 * 12. Waffle with Honey, Badam
 * 13. Waffle with Honey, Gems.
 * 14. Waffle with Honey, Chocolate, Caramel
 * 15. Waffle with Honey, Chocolate, Cashew
 * 16. Waffle with Honey, Chocolate, StrawBerry
 *
 *
 *
 *
 */

