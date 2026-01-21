package iuh.fit.se.decorator;

public class ProcessingFee extends AmountDecorator {
    public ProcessingFee(PaymentAmount amount) { super(amount); }
    public double getCost() { return tempAmount.getCost() + 2.0; } // Phí 2$
    public String getDescription() { return tempAmount.getDescription() + " + Phí xử lý (2$)"; }
}
