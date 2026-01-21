package iuh.fit.se.strategy;

public class EconomyShipping implements ShippingStrategy {
    public double calculateFee(double weight) { return weight * 5000; }
}
