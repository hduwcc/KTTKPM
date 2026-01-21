package iuh.fit.se.state;

import iuh.fit.se.decorator.OrderComponent;
import iuh.fit.se.strategy.ShippingStrategy;

public class OrderContext {
    private OrderState state = new NewOrderState();
    private OrderComponent orderDetails;
    private ShippingStrategy shipping;
    private String shippingName;

    public OrderContext(OrderComponent order, ShippingStrategy shipping, String shipName) {
        this.orderDetails = order;
        this.shipping = shipping;
        this.shippingName = shipName;
    }

    public void setState(OrderState state) { this.state = state; }
    public String getShippingName() { return shippingName; }

    public void applyProcess() {
        state.processOrder(this);
    }

    public void showBill() {
        double shipFee = shipping.calculateFee(2.0); // Giả sử 2kg
        System.out.println("Chi tiết: " + orderDetails.getDescription());
        System.out.println("Tổng chi phí: " + (orderDetails.getPrice() + shipFee));
    }
}
