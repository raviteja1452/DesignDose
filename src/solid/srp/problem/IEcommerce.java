package solid.srp.problem;

public interface IEcommerce {
    void addItemToCart();

    void deleteItemFromCart();

    void updateItemToCart();

    String createOrder();

    void deleteOrder(String orderId);

    void trackOrderShipment(String orderId);

    void makePaymentForOrder(String orderId);

    void createUserAccount();

    void loginUserAccount();

    void forgetPassword();

    void resetPassword();
}
