package iuh.fit.se.state;

import iuh.fit.se.decorator.PaymentAmount;
import iuh.fit.se.strategy.PaymentStrategy;

public class PaymentProcessor {
    private PaymentState state = new InitializedState();
    private PaymentStrategy strategy;
    private PaymentAmount amount;

    public PaymentProcessor(PaymentAmount amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
    }

    public void setState(PaymentState state) { this.state = state; }

    public void process() {
        System.out.println("Nội dung: " + amount.getDescription());
        strategy.collectDetails();

        // Chạy qua các trạng thái
        state.next(this); // Init -> Auth
        state.next(this); // Auth -> Done

        strategy.execute(amount.getCost());
        state.next(this); // Kết thúc
    }
}
