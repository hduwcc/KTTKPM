package iuh.fit.se.state;

public class CompletedState implements PaymentState {
    public void next(PaymentProcessor processor) {
        System.out.println("Trạng thái: Thanh toán thành công. Kết thúc quy trình.");
    }
}
