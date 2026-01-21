package iuh.fit.se;

public class Order {
    private ShippingStrategy shippingStrategy;

    // Cho phép đổi chiến lược lúc đang chạy (Runtime)
    public void setShippingStrategy(ShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    public double calculateTotalShipping(double weight, double distance) {
        return shippingStrategy.calculate(weight, distance);
    }
}
