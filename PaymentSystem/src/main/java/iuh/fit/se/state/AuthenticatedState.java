package iuh.fit.se.state;

public class AuthenticatedState implements PaymentState {
    public void next(PaymentProcessor processor) {
        System.out.println("Trạng thái: Đã xác thực. Chuyển sang Hoàn tất...");
        processor.setState(new CompletedState());
    }
}
