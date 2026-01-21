package iuh.fit.se;

public class PendingState implements OrderState {
    public void handleCancel(OrderContext context) {
        System.out.println("Hủy đơn thành công.");
        // Chuyển sang trạng thái Đã hủy
    }
    public void handleNext(OrderContext context) {
        System.out.println("Đang chuyển sang giai đoạn Giao hàng...");
        context.setState(new ShippingState());
    }
}
