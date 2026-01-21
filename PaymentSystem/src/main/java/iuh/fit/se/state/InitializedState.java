package iuh.fit.se.state;

public class InitializedState implements PaymentState {
    public void next(PaymentProcessor processor) {
        System.out.println("Trạng thái: Đã khởi tạo. Chuyển sang Xác thực...");
        processor.setState(new AuthenticatedState());
    }
}
