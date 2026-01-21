package iuh.fit.se;

public class GrabDeliveryStrategy implements ShippingStrategy {
    public double calculate(double weight, double distance) {
        return 30000; // Giá cố định
    }
}
