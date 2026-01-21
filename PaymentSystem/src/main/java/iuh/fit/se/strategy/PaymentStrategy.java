package iuh.fit.se.strategy;

public interface PaymentStrategy {
    void collectDetails();
    void execute(double amount);
}
