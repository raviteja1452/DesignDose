package solid.srp.problem;

public class Ecommerce implements  IEcommerce{

    @Override
    public void addItemToCart() {

        // CartRepository
        // CartRepository.save();
        // adds the items to cart
    }

    @Override
    public void deleteItemFromCart() {
        // deletes items from cart
    }

    @Override
    public void updateItemToCart() {
        // updates items to cart
    }

    @Override
    public String createOrder() {

        // List of items that are added to cart & then create order of out it.
        // Generates an orderId.
        return null;
    }

    @Override
    public void deleteOrder(final String orderId) {
        // Cancel out order.
    }

    @Override
    public void trackOrderShipment(final String orderId) {
        // tracking the order shipment.
    }

    @Override
    public void makePaymentForOrder(final String orderId) {
        // making payment.
    }

    @Override
    public void createUserAccount() {
        // adds user details to databases & generates userId
    }

    @Override
    public void loginUserAccount() {
        // takes credentials & allow login.
    }

    @Override
    public void forgetPassword() {
        // helps in retrieving the password.
    }

    @Override
    public void resetPassword() {
        // helps in resetting the password.
    }
}
