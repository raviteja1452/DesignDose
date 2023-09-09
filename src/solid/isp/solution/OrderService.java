package solid.isp.solution;


public class OrderService implements IOrderService {

    ICartService cartService;

    @Override
    public String createOrder() {

        // have definition
        return null;
    }

    @Override
    public void deleteOrder(final String orderId) {
        // have definition
    }

    @Override
    public void trackOrderShipment(final String orderId) {
        // have definition
    }

    @Override
    public void makePaymentForOrder(final String orderId) {
        // have definition
    }
}
