package iuh.fit.se.strategy;

public class PayPalStrategy implements PaymentStrategy {
    public void collectDetails() { System.out.println("Đang đăng nhập PayPal..."); }
    public void execute(double amount) { System.out.println("Thanh toán " + amount + " bằng PayPal."); }
}