package iuh.fit.se.decorator;

public class Discount extends AmountDecorator {
    public Discount(PaymentAmount amount) { super(amount); }
    public double getCost() { return tempAmount.getCost() - 5.0; } // Giảm 5$
    public String getDescription() { return tempAmount.getDescription() + " - Mã giảm giá (5$)"; }
}
