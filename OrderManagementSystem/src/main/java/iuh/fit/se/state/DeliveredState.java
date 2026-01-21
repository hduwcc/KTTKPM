package iuh.fit.se.state;

public class DeliveredState implements OrderState {
    public void processOrder(OrderContext context) {
        System.out.println("3. Trạng thái ĐÃ GIAO: Cập nhật hệ thống thành công.");
    }
}
