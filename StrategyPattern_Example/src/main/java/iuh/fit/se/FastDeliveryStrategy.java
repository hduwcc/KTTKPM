package iuh.fit.se;

public class FastDeliveryStrategy implements ShippingStrategy {
    public double calculate(double weight, double distance) {
        return weight * 2000 + distance * 500;
    }
}
