package iuh.fit.se.strategy;

public class VietnamTaxStrategy implements TaxStrategy {
    public double applyTax(double amount) { return amount * 0.1; } // VAT 10%
}
