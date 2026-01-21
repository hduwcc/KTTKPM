package iuh.fit.se;

public class ShippingState implements OrderState {
    public void handleCancel(OrderContext context) {
        System.out.println("LỖI: Không thể hủy khi đang giao hàng!");
    }
    public void handleNext(OrderContext context) {
        System.out.println("Đã giao hàng thành công.");
        context.setState(new DeliveredState());
    }
}