package iuh.fit.se.state;

public class ProcessingState implements OrderState {
    public void processOrder(OrderContext context) {
        System.out.println("2. Trạng thái ĐANG XỬ LÝ: Đang đóng gói và vận chuyển bằng "
                + context.getShippingName() + "...");
        context.setState(new DeliveredState());
    }
}
