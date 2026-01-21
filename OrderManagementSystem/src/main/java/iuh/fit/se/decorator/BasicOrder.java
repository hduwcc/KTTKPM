package iuh.fit.se.decorator;

public class BasicOrder implements OrderComponent {
    private double basePrice;
    public BasicOrder(double price) { this.basePrice = price; }
    public double getPrice() { return basePrice; }
    public String getDescription() { return "Đơn hàng cơ bản"; }
}
