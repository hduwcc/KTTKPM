package iuh.fit.se.state;

public class NewOrderState implements OrderState {
    public void processOrder(OrderContext context) {
        System.out.println("1. Trạng thái MỚI TẠO: Đang kiểm tra thông tin...");
        context.setState(new ProcessingState());
    }
}
