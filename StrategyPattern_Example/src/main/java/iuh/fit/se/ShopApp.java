package iuh.fit.se;

public class ShopApp {
    public static void main(String[] args) {
        Order order = new Order();
        double weight = 2.5; // kg
        double distance = 10; // km

        // Người dùng chọn Giao hàng nhanh
        order.setShippingStrategy(new FastDeliveryStrategy());
        System.out.println("Phí GHN: " + order.calculateTotalShipping(weight, distance));

        // Người dùng đổi ý chọn Grab
        order.setShippingStrategy(new GrabDeliveryStrategy());
        System.out.println("Phí Grab: " + order.calculateTotalShipping(weight, distance));
    }
}
