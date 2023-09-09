package solid.isp.solution;

public interface IOrderService {
    String createOrder();

    void deleteOrder(String orderId);

    void trackOrderShipment(String orderId);

    void makePaymentForOrder(String orderId);
}
