package iuh.fit.se.strategy;

public class USTaxStrategy implements TaxStrategy {
    public double applyTax(double amount) { return amount * 0.08; } // Sales Tax 8%
}
