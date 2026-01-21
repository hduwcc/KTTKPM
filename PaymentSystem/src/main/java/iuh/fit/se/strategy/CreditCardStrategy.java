package iuh.fit.se.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    public void collectDetails() { System.out.println("Đang thu thập số thẻ..."); }
    public void execute(double amount) { System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng."); }
}
