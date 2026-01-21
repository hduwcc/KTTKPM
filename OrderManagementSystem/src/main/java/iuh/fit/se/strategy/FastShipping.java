package iuh.fit.se.strategy;

public class FastShipping implements ShippingStrategy {
    public double calculateFee(double weight) { return weight * 10000; }
}
