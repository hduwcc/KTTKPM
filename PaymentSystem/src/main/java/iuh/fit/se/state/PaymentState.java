package iuh.fit.se.state;

public interface PaymentState {
    void next(PaymentProcessor processor); // Mặc định là public
}
